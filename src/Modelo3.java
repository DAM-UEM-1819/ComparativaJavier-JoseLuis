import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Modelo3 {
	Properties properties;
	File file;
	FileInputStream imput;
	FileOutputStream output;

	public String getUsr() {
		properties = new Properties();
		File fichero;
		fichero = new File("src/Recuperacion/Config.ini");
		try {
			imput = new FileInputStream(fichero);
			output = new FileOutputStream(fichero, true);
			properties.load(imput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String usuario = properties.getProperty("usuario");
		return usuario;
	}

	public String getPwd() {
		file = new File("src/Recuperacion/Config.ini");
		try {
			imput = new FileInputStream(file);
			output = new FileOutputStream(file, true);
			properties.load(imput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String contra = properties.getProperty("contraseña");
		return contra;
	}

	public String getUrl() {
		file = new File("src/Recuperacion/Config.ini");
		try {
			imput = new FileInputStream(file);
			output = new FileOutputStream(file, true);
			properties.load(imput);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = properties.getProperty("url");
		return url;
	}

	public String getNotes() {
		file = new File("src/Recuperacion/Config.ini");
		try {
			imput = new FileInputStream(file);
			output = new FileOutputStream(file, true);
			properties.load(imput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String notas = properties.getProperty("notas");
		return notas;
	}

	public String setData(String usr, String pwd, String url, String notes) {
		file = new File("src/Recuperacion/Config.ini");
		try {
			imput = new FileInputStream(file);
			output = new FileOutputStream(file, true);
			properties.load(imput);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		properties.setProperty("usuario", usr);
		properties.setProperty("contraseña", pwd);
		properties.setProperty("url", url);
		properties.setProperty("notas", notes);
		return "hecho";
	}
}
