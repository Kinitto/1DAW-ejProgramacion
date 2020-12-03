package es.studium.Cadenas10;

import java.util.Scanner;

public class Cadenas16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = new String();
		StringBuilder resul = new StringBuilder();
		
		System.out.println("Ingrese una palabra");
		cadena = teclado.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.toString(cadena.charAt(i)).equalsIgnoreCase(" ")) {
				
				resul.append(cadena.replace(" ", ""));
				i=i+cadena.length();
			}
		}
		
		System.out.println(resul);
		teclado.close();

	}

}
