package numerosamigos;

public class NumerosAmigos {

	public static void main(String[] args) {

		int suma = 0;
		int numero1 = 220;
		int numero2 = 284;

		for (int i = 1; i < numero1; i++) {
			int e = numero1 % i;
			if (e == 0) {
				suma = suma + i;
			}
			
		}
		if (suma == numero2) {
			suma = 0;
			for (int i = 1; i < numero2; i++) {
				int s = numero2 % i;
				if (s == 0) {
					suma = suma + i;
				}
			}
			if (suma == numero1) {
			System.out.println("Son numeros amigos");
		}
		} 
		
		else {
			System.out.println("No son numeros amigos");
		}
	}

}
