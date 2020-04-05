import java.util.ArrayList;

public class Modelo2 {
	private Alumno miAlumno;

	public Modelo2() {
		miAlumno = new Alumno();
	}

	public String nuevaAsignatura(String nombre, String nota) {
		return miAlumno.nueva(nombre, nota);
	}

	public String media() {
		return miAlumno.media();
	}

	public String nota(String nombre) {
		return miAlumno.nota(nombre);
	}
}

class Alumno extends Asignatura {

	ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Alumno() {

	}

	public String nueva(String nombre, String nota) {
		int notaalum = Integer.valueOf(nota);
		Asignatura asignatura = new Asignatura();
		asignatura.setNombre(nombre);
		asignatura.setNota(notaalum);
		asignaturas.add(asignatura);
		String longitud = String.valueOf(asignaturas.size());
		return longitud;
	}

	public String media() {
		int counter = 0;
		for (Asignatura asignatura : asignaturas) {
			counter += asignatura.getNota();
			System.out.println(counter);
		}
		double resultado = counter / asignaturas.size();
		System.out.println(resultado);
		double media = Math.round((((counter / asignaturas.size()) * 100)) / 100d);
		String mediaStr = String.valueOf(media);
		return mediaStr;
	}

	public String nota(String nombre) {
		for (Asignatura asignatura : asignaturas) {
			if (asignatura.getNombre().equalsIgnoreCase(nombre)) {
				return String.valueOf(asignatura.getNota());
			}
		}
		return "Esa no existe";
	}

}

class Asignatura {
	private String nombre;
	private int nota;

	public int getNota() {
		return nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
