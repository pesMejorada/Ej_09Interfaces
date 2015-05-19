package es.curso.interface1;

public abstract class Canino {
	  private String nombre;
	  private String raza;
	  
	  public Canino() {
		super();
	}
     
	public Canino(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}
     
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public abstract void emitirSonido();
	  

}
