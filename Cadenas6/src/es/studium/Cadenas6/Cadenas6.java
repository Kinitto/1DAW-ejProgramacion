package es.studium.Cadenas6;

import java.util.Scanner;

public class Cadenas6 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.println("Dame una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		if (cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}
	}

}
