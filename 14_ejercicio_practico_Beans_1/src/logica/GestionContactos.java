package logica;

import beans.Contacto;

public class GestionContactos {
	private Contacto[] contactos; // array de "objetos Contacto de la clase Beans".
	private int totalContactos; // para cuantizar, maximo seran 10 en este caso

	public GestionContactos() { // el constructor inicia el array de Contacto y el contador
		contactos = new Contacto[10];
		totalContactos = 0;
	}

	public boolean espacioLibre() {
		if (totalContactos < 10) {
			return true;
		} else {
			return false;
		}
	}

	public boolean agregar(String nombre, int edad, String email) {
		if (totalContactos < 10) {
			Contacto c = new Contacto(nombre, edad, email);
			contactos[totalContactos] = c; //voy aumentanto "totalContactos" y rellenando el array de objetos "contactos"
			totalContactos++;
			return true;
		} else {
			return false;
		}
	}
	
	public Contacto buscar (String nombre) { //retorna un objeto contacto, re piola
		Contacto c=null;
		for(int i=0; i<totalContactos; i++) {
			if(contactos[i].getNombre().equals(nombre)) {
				c=contactos[i];
				break;
			}
		}
		return c; //devuelve el objeto encontrado, sino null
	}
	
	public Contacto[] recuperarContactos() {
		Contacto[] existentes = new Contacto[totalContactos];
		for(int i=0; i<totalContactos; i++) {
			existentes[i]=contactos[i]; //se  crea un nuevo array que tenga el tamaño total de contactos creados al momentos 
		}
		return existentes;
	}
}
