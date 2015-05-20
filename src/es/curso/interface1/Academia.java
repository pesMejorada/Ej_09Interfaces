package es.curso.interface1;

public class Academia {
	  private String nombre;

	public Academia(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Academia() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Academia [nombre=" + nombre + "]";
	}
	  
	

}
