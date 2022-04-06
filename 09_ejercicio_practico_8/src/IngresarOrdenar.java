import java.util.Scanner;

public class IngresarOrdenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		int num, aux;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese numero positivo");
			num = sc.nextInt();
			while (num < 0) {
				System.out.println("Reingrese. Tiene que ser positivo");
				num = sc.nextInt();
			}
			numeros[i] = num;
		}

		for (int i = 1; i < numeros.length; i++) {

			for (int k = i; k < numeros.length; k++) {
				if (numeros[k] > numeros[i]) {
					aux = numeros[i];
					numeros[i] = numeros[k];
					numeros[k] = aux;
				}
			}
		}

		for (int n : numeros) {
			System.out.println(n);
		}
	}

}
