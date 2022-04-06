
public class CalculoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 5;
		int mayor = 0;
		int menor = 0;

		if (a > b) {
			mayor = a;
			menor = b;
		} else if (b > a) {
			mayor = b;
			menor = a;
		} else
			System.out.println("Son iguales los numeros pachi");

		int aux = mayor;
		int suma = 0;

		for (int i = (mayor - menor) + 1; i > 0; i--) {
			if (aux % 2 == 0) {
				System.out.println("Es par:" + aux);
				suma += aux;
			}

			aux -= 1;

		}
		System.out.println("Suma de los pares:" + suma);

	}

}
