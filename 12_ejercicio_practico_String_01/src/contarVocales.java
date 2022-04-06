import java.util.Scanner;

public class contarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		int totalVocales=0;
		Scanner sc = new Scanner(System.in);
		String texto;
		int[] cantVocales = new int[5];
		
		
		System.out.println("Ingrese un texto: ");
		texto = sc.nextLine();
		System.out.println(texto.indexOf("a"));

		while (cont < texto.length()) {
			switch(texto.charAt(cont)) { //texto.charAt(i) devuelve el caracter de la posicion i
			case 'a': cantVocales[0]++; break;
			case 'e': cantVocales[1]++; break;
			case 'i': cantVocales[2]++; break;
			case 'o': cantVocales[3]++; break;
			case 'u': cantVocales[4]++; break;
			}
		cont++;
		}
		
		for(int i=0; i<cantVocales.length; i++) {
			if(cantVocales[i] != 0) {
				totalVocales+=cantVocales[i];
			}
		}

		System.out.println("Hay un total de: "+totalVocales+" vocales");
	}

}
