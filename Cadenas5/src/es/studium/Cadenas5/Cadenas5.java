package es.studium.Cadenas5;

import java.util.Scanner;

public class Cadenas5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Dame la cadena");
		cadena = teclado.nextLine();
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());

		teclado.close();

	}

}
