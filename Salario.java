package interfaces;
public class Salario implements Comparable {
	private double base;
	private double complemento;
	private double retraccion;
	
	public Salario(double base, double complemento, double retraccion) {
		super();
		this.base = base;
		this.complemento = complemento;
		this.retraccion = retraccion;
	}

	public double liquido() {
		return base+complemento-retraccion;
	}

	@Override
	public boolean mayorQue(Object objeto) {
		boolean respuesta;
		
		if (this.liquido() > ((Salario)objeto).liquido()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}

	@Override
	public boolean menorQue(Object objeto) {
		boolean respuesta;
		
		if (this.liquido() < ((Salario)objeto).liquido()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}

	@Override
	public boolean igualQue(Object objeto) {
		boolean respuesta;
		
		if (this.liquido() == ((Salario)objeto).liquido()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
}
