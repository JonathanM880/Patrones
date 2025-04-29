package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
	private Properties properties;
	
	public ConfigLoader(String file) {
		this.properties = new Properties();
		try (InputStream input = getClass().getClassLoader().getResourceAsStream(file)){
			if(input == null) {
				throw new RuntimeException("Archivo de configuracion no encontrado");
			}
			properties.load(input);
		}catch(IOException e){
			throw new RuntimeException("ERRORRRRRRRR al leer el archivo de configuración");
		}
	}
	
	public String get(String key) {
		return properties.getProperty(key);
	}
}
