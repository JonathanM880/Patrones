package gen;

import java.util.HashMap;
import java.util.Map;

import com.google.common.reflect.ClassPath;

import anotacion.Tema;
import inter.UIFactory;

//ver java beans

public class AbstractFactoryLoader {
	
	Map<String, Class<? extends UIFactory>> factories = new HashMap<>();
	
	public void init(String pkName) {
		try {
			ClassPath classPath = ClassPath.from(getClass().getClassLoader());
			for(ClassPath.ClassInfo classInfo : classPath.getTopLevelClassesRecursive(pkName)) { //de ese nivel hacia arriba
				Class<?> clas = classInfo.load();
				UIFactory.class.isAssignableFrom(clas);
				var anotacion = clas.getAnnotation(Tema.class);
				
				if(anotacion != null) {
					factories.put(anotacion.value(), (Class<? extends UIFactory>) clas);
				} 
			}
		}catch(Exception e){
			throw new RuntimeException("  Error no encuentro fabricas xdxdxdxdxd ");
		}
	}
	
	public UIFactory createFactory(String tema) {
		Class<? extends UIFactory> factoryClass = factories.get(tema);
		
		if(factoryClass == null) {
			throw new RuntimeException("No se ha encontrado la fabrica " +factories.get(tema)+" pipipipipi ");
		}
		
		try{
			return factoryClass.getDeclaredConstructor().newInstance();
		}catch(Exception e) {
			throw new RuntimeException("F mi gente ");
		}
	}
}
