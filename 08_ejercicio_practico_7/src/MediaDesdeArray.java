
public class MediaDesdeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] datos = { 2, 4, 2, 6, 8 };
		float suma = 0;
		int max = 0;

		for (int n : datos) {
			// System.out.println("Elemento: "+n);
			suma += n;

			if (n > max) {
				max = n;
			}

		}
		System.out.println("La longitud es: " + datos.length);
		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + suma / datos.length);
		System.out.println("El maximo es: " + max);
		
	}

}
