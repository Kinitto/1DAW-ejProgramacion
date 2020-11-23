package es.studium.Cadenas8;
import java.util.Scanner;

public class Cadenas8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		char caracter;
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Dame un caracter");
		caracter = teclado.nextLine().charAt(0);
		
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)==caracter) {
				System.out.println("el caracter aparece en la posicion "+i);
				i=cadena.length();
			}
		}
		teclado.close();
	}

}
