import java.util.Scanner;

public class IngresoNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String texto, nombre;
		String[] v_Nombres;
		int contador = 0;

		// pedir a usuario que ingrese nombres separados por ","
		System.out.println("Ingrese una cadena de nombres separados por  ',' : ");
		texto = sc.nextLine();

		// pedir al usuario que ingrese un nombre
		System.out.println("Ingrese un nombre: ");
		nombre = sc.nextLine();

		// buscar cuantas veces coincide el nombre ingresado con los nombres de la
		// cadena
		v_Nombres = texto.split(",");

		for (int i = 0; i < v_Nombres.length; i++) {
			if (nombre.equalsIgnoreCase(v_Nombres[i])) {
				contador++;
				
			}
		}
		System.out.printf("Hay un total de %d coincidencias",contador);

		// mostrar el resultado
	}

}
