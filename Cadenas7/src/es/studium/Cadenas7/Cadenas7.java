package es.studium.Cadenas7;

import java.util.Scanner;

public class Cadenas7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Longitud con espacios"+cadena.length());
		System.out.println("Longitud sin espacios"+sinEspacios(cadena));
teclado.close();
	}
	public static int sinEspacios(String cad) {
		int longitud = 0;
		int i;
		for (i=0;i<cad.length();i++) {
			if (cad.charAt(i)!=' ') {
				longitud++;
			}
		}
		
		return (longitud);
	}

}