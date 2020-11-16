package es.studium.Cadenas;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {

		String nombre1, nombre2, nombre3, nombre4, nombre5;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer nombre");
		nombre1 = teclado.nextLine();
		System.out.println("Dame el segundo nombre");
		nombre2 = teclado.nextLine();
		System.out.println("Dame el tercer nombre");
		nombre3 = teclado.nextLine();
		System.out.println("Dame el cuarto nombre");
		nombre4 = teclado.nextLine();
		System.out.println("Dame el quinto nombre");
		nombre5 = teclado.nextLine();
		teclado.close();
		System.out.println(nombre1);
		System.out.println(nombre2);
		System.out.println(nombre3);
		System.out.println(nombre4);
		System.out.println(nombre5);

	}

}
