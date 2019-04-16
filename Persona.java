package interfaces;
public class Persona implements Comparable {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public boolean mayorQue(Object objeto) {
		boolean respuesta;
		
		if (this.getEdad() > ((Persona)objeto).getEdad()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	@Override
	public boolean menorQue(Object objeto) {
		boolean respuesta;
		
		if (this.getEdad() < ((Persona)objeto).getEdad()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	@Override
	public boolean igualQue(Object objeto) {
		boolean respuesta;
		
		if (this.getEdad() == ((Persona)objeto).getEdad()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}	
}
