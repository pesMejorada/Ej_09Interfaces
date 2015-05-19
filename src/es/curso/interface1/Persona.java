package es.curso.interface1;

public class Persona extends Humano implements Actor  {
    
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos) {
		super(nombre, apellidos);
	}

	@Override
	public void estudiar() {
		System.out.println(getNombre() + " "+ getApellidos() +".. estudiando...."); 		
	}

	@Override
	public void actuar() {
		System.out.println(getNombre() + " "+ getApellidos() + "... actuando");
		
	}

}





















