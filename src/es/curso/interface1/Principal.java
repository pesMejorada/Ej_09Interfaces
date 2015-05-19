package es.curso.interface1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("María", "Cáceres");
		p1.estudiar(); // heredado de humano, imlementado en Persona
        p1.hablar();// heredado de la superclase Humano
        p1.actuar();// se hereda de la interface Actor, se implementa
                     // en Persona
        Perro perro1= new Perro("Pluto", "Dalmata");
        perro1.emitirSonido();
        perro1.actuar();
      
        System.out.println("Usando la referencia del tipo Actor<<interface>>");
        Actor actor1;
        actor1=p1;// puedo apuntar a una persona con una referencia de tipo Actor
        actor1.actuar();// "veo" al objeto persona como un actor. Sólo tengo acceso 
                         // a los métodos de la Interface (Actor)-> actuar
        
       
        actor1= perro1;// puedo apuntar a un Perro con una referencia de tipo Actor
        actor1.actuar(); // "veo" al objeto Perro como un actor. Sólo tengo acceso 
                 // a los métodos de la Interface (Actor)-> actuar
        
        
        
        
        
        
        
        
        
        
        
	}

}
