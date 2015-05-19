package es.curso.interface1;

public abstract class Humano {
	
   private String nombre;
   private String apellidos;

   public Humano() {
		super();
	}

	public Humano(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void hablar(){
		   System.out.println("bla bla bla");
    }
	   
    public abstract void estudiar();

}
