
public class NumPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 88;
		boolean bandera = false;
//		System.out.println("resto por 2: "+(num%2));
//		System.out.println("resto por 3: "+(num%3));
//		System.out.println("resto por 5: "+(num%5));

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				bandera = true;

			System.out.printf("resto por %d = %d\n", i, num % i);
		}
		if (bandera == false)
			System.out.printf("El numero es primo: %d", num);
		else
			System.out.println("El numero NO es primo: " + num);
	}

}
