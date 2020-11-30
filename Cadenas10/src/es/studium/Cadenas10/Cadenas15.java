package es.studium.Cadenas10;
import java.util.Scanner;

public class Cadenas15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = new String();
		StringBuilder resul = new StringBuilder();
		
		System.out.println("Ingrese una palabra");
		cadena = teclado.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.toString(cadena.charAt(i)).equalsIgnoreCase("a")) {
				resul.append("h" + cadena.charAt(i));
			} else {
				resul.append(cadena.charAt(i));
			}
		}
		
		System.out.println(resul);
		teclado.close();

	}

}
