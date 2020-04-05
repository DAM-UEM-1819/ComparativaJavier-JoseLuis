import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Modelo3 {
	FileInputStream entrada;
	FileOutputStream salida;
	Properties propiedades;
	File fichero;

	public String getUsr() {
		propiedades = new Properties();
		File fichero;
		fichero = new File("src/Recuperacion/Config.ini");
		try {
			entrada = new FileInputStream(fichero);
			salida = new FileOutputStream(fichero, true);
			propiedades.load(entrada);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String usr = propiedades.getProperty("usuario");
		return usr;
	}

	public String getPwd() {
		fichero = new File("src/Recuperacion/Config.ini");
		try {
			entrada = new FileInputStream(fichero);
			salida = new FileOutputStream(fichero, true);
			propiedades.load(entrada);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String pwd = propiedades.getProperty("passwd");
		return pwd;
	}

	public String getUrl() {
		fichero = new File("src/Recuperacion/Config.ini");
		try {
			entrada = new FileInputStream(fichero);
			salida = new FileOutputStream(fichero, true);
			propiedades.load(entrada);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String url = propiedades.getProperty("url");
		return url;
	}

	public String getNotes() {
		fichero = new File("src/Recuperacion/Config.ini");
		try {
			entrada = new FileInputStream(fichero);
			salida = new FileOutputStream(fichero, true);
			propiedades.load(entrada);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String notes = propiedades.getProperty("notes");
		return notes;
	}

	public String setData(String usr, String pwd, String url, String notes) {
		fichero = new File("src/Recuperacion/Config.ini");
		try {
			entrada = new FileInputStream(fichero);
			salida = new FileOutputStream(fichero, true);
			propiedades.load(entrada);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		propiedades.setProperty("usuario", usr);
		propiedades.setProperty("passwd", pwd);
		propiedades.setProperty("url", url);
		propiedades.setProperty("notes", notes);
		try {
			propiedades.store(salida, "Comentario para el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "hecho";
	}
}
