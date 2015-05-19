package es.curso.interface1;

public class Perro extends Canino implements Actor{
    
	public Perro() {
		super();
	}

	public Perro(String nombre, String raza) {
		super(nombre, raza);
	}

	@Override
	public void emitirSonido() {
		System.out.println("guau guau");
	}
    
	public void rastrear(){
		System.out.println("Perro " + getNombre() + " "+getRaza() + " rastreando");
		
	}

	@Override
	public void actuar() {
		System.out.println("Perro " + getNombre() +" "+getRaza() +" actuando");
	}
}
