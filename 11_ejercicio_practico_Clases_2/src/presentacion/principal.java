 package presentacion;
 
import java.util.Scanner;
import logica.gestionNotas;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		gestionNotas n = new gestionNotas();

		int opc, nota;
		double promedio;

		do {
			System.out.println("\n Elija una opción: ");
			System.out.println("1-Agregar nota");
			System.out.println("2-Ver nota media");
			System.out.println("3-Ver aprobados");
			System.out.println("4-Salir");

			opc = sc.nextInt();
			switch (opc) {
			case 1: {
				do {
					System.out.println("Ingrese la nota entre 1 y 10: ");
					nota = sc.nextInt();
				} while (nota < 1 || nota > 10);
				if (n.AgregarNota(nota))
					System.out.println("Nota agregada correctamente");
				else
					System.out.println("Cupo lleno, no se pudo agregar nota");
			}
				break;

			case 2: {
				promedio = n.VerNotaMedia();
				System.out.println("El promedio de las notas es:" + promedio);
			}
				break;
			case 3:
				System.out.println("Cantidad de aprobados: " + n.VerAprobados());
				break;
			default:
				System.out.println("Opcion invalida, reintente.");
			}
		} while (opc != 4);

		System.out.println("4-Programa finalizado");
	}

}
