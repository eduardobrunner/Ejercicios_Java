
public class SumaDaMil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int semilla = 0;
		int suma = 0;

		do {
			semilla += 1;
			suma += semilla;

			System.out.printf("semilla: %d	suma:%d\n\n", semilla, suma);
		} while (suma < 1000);

		System.out.printf("Hay que sumar hasta el %d para llegar o sup a 1000", semilla);
	}

}
