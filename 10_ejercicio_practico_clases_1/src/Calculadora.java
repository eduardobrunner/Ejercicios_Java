
class Calcular {
	private int x, y;

	// constructor: para inicializar atributos
	public Calcular(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int sumar() {
		return x + y;
	}

	public int restar() {
		return x - y;
	}
	/* Estos metodos no son necesarios si usamos el constructor */
//	public void guardarX(int x) {
//		this.x = x;
//	}
//
//	public void guardarY(int y) {
//		this.y = y;
//	}
}

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b = 2;

		Calcular c = new Calcular(a,b);
//		c.guardarX(a);
//		c.guardarY(b);

		System.out.println("La suma es: " + c.sumar());
		System.out.println("La resta es: " + c.restar());
	}

}
