package logica;

public class gestionNotas {
	private int recorrerVector;
	private double promedio;
	private int cantidadAprobados;
	private int[] notas = new int[10];

	// constructor de la clase
	public boolean AgregarNota(int x) {
		if (recorrerVector < 10) {
			notas[recorrerVector] = x;
			recorrerVector++;
			return true;
		} else
			return false;
	}

	public double VerNotaMedia() {
		// sumar todas las notas y dividir por la cant total
		for (int i = 0; i < notas.length; i++) {
			promedio += notas[i];
		}
		promedio = promedio / notas.length;
		return promedio;
	}

	public int VerAprobados() {
		for (int n : notas) {
			if (n >= 6)
				cantidadAprobados++;
		}
		return cantidadAprobados;
	}
}
