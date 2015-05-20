package es.curso.interface1;

import java.util.ArrayList;

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
        
        Object refObject;
        refObject =p1; // haya cast Implicito
                       // Se hace cuando se asigan una referencia más especifica
                        // auna referencia más genérica
                        // equeivale a refObject =(Object)p1;
        System.out.println("Impresion con toString");
        System.out.println("Apuntando con refObject -Object-"+refObject);
        
        Persona p99;
        p99=(Persona) refObject;// cast Explicito 
                                // Se hace cuando se asigna un referencia más 
                                // genérica a una referencia más especifica
        System.out.println("Apuntando con p99 -Persona-" + p99);
        p99.actuar(); // con la referencia p99 q es de la misma clase 
                      // del objeto al cual apunta refObject tengo acceso a 
                      // todos los métodos que tiene la clase Persona
        p99.estudiar();   
        
        Academia acad1= new Academia("Fundación Altius");
        refObject = acad1;
        System.out.println("Academia apuntada con refObject -Object-"
                            +refObject);
       
         
        ArrayList<Object> arrayDeObjects= new ArrayList<Object>();
	    // en un array tipo Object se pueden manipular e insertar
          // objetos de cualquier clase
        arrayDeObjects.add(p1);
        arrayDeObjects.add(perro1);
        arrayDeObjects.add(acad1);
        
        System.out.println("Imprimiendo el array de Objects");
        for (Object object : arrayDeObjects) {
			System.out.println(object); // invoca al método toString
		}
        
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
