package Modelo;

public class Numeros {
	
	private int x;
	
	public Numeros(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int sumar(int n1) {
		return x + n1;
	}
	
	public int multiplicar(int n1) {
		return x * n1;
	}
	
	public boolean esPar() {
		return x % 2 == 0;
		
	}
	
	public boolean esPrimo() {
		boolean p = true;
		int i = 2;
		if (x < 2) p = false;
		else {
			while(p && i<=Math.sqrt(x)) {
				if(x % i == 0) {
					p = false;
				}
				i = i + 1;
			}
		}
		return p;
	}
	
	public String convertirAString() {
		return String.valueOf(x);
	}
	
	public double convertirADouble() {
		return Double.parseDouble(String.valueOf(x));
	}
	
	public double calcularPotencia(int Exp) {
		
		return Math.pow(x, Exp);
	}
	
	public String pasarBase2() {
		String b = "";
		int i;
		int aux = x;
		while(aux > 0) {
			i = aux % 2;
			String d = String.valueOf(i);
			b = d + b;
			aux = aux/2;
		}
		return b;
		
	}
	
	public int calcularFactorial() {
		if (x >= 0) {
			int factorial = 1;
			int i = x;
			while(i > 1) {
				factorial *= i;
				i--;
			}
			return factorial;
		}else {
			return 1;
		}
			
	}
	
	public int numeroCombinatorio(int n) {
		
		int [] combinacion = new int [n-1];
		int suma = 0;
		
		for (int i = 1; i <= n; i++) {
			suma+=1;
			if(suma <= n) {
			
				
			}
			
			
		}
		
	}
	
}
