package calculadoraED;

public class calculadora {
	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b) { 
		return a - b; 
		} 
		public int multiplicar(int a, int b) { 
		return a * b; 
		} 
		
	public static void main(String[] args) {
		calculadora calc = new calculadora();
		System.out.println("Resultado de la suma: " + calc.sumar(5, 3));
	}
}