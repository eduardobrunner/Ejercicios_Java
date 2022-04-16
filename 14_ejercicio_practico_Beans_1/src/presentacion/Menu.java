package presentacion;

import java.util.Scanner;

import beans.Contacto;
import logica.GestionContactos;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GestionContactos gestor = new GestionContactos();
		int op = 0;// opcion para menu
		do {
			String nombre;
			int edad;
			String email;

			System.out.println("1.- Anadir contacto");
			System.out.println("2.- Buscar contacto");
			System.out.println("3.- Mostrar todos");
			System.out.println("4.- Salir\n");

			op = Integer.parseInt(sc.nextLine());

			switch (op) {
			case 1:
				if (gestor.espacioLibre()) {
					System.out.println("Ingrese Nombre: ");
					nombre = sc.nextLine();
					System.out.println("Ingrese edad: ");
					edad = Integer.parseInt(sc.nextLine());
					System.out.println("Ingrese email: ");
					email = sc.nextLine();
					// llamo al metodo agregar:
					gestor.agregar(nombre, edad, email);
				} else {
					System.out.println("No hay espacio disponible");
				}
				break;
			case 2: {
				System.out.println("Ingrese Nombre a buscar: ");
				nombre = sc.nextLine();
				Contacto c=gestor.buscar(nombre);
				if(c==null) {
					System.out.println("No se ha encontrado el nombre buscado ");
				}
				else {
					System.out.printf("Nombre: %s - Edad: %d - Email: %s \n", c.getNombre(),c.getEdad(),c.getEmail());
				}
			}break;
			case 3:
				Contacto[] todos = gestor.recuperarContactos();
				for(Contacto con:todos) {
					System.out.printf("Nombre: %s - Edad: %d - Email: %s \n", con.getNombre(),con.getEdad(),con.getEmail());
				}
				break;
			case 4:
				break;
			default:
				System.out.println("opcion invalida");
			}

		} while (op != 4);
		System.out.println("Saliendo!!!");
	}
}
