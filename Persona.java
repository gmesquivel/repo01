package interfaces;
public class Persona implements Comparable<Persona> {
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
	public boolean mayorQue(Persona otro) {
		boolean respuesta;
		
		if (this.getEdad() > otro.getEdad()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	@Override
	public boolean menorQue(Persona otro) {
		boolean respuesta;
		
		if (this.getEdad() < otro.getEdad()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	@Override
	public boolean igualQue(Persona otro) {
		boolean respuesta;
		
		if (this.getEdad() == otro.getEdad()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}	
}
