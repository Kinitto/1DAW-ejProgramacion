package es.studium.Intercalar;

import java.util.Scanner;

public class Intercalar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Creamos dos variables tipo String Creamos dos iteradores, uno para cada
		 * cadena Creamos también la variable resultado, esta nos servirá para almacenar
		 * el resultado de mezclar las dos cadenas
		 */
		String cadena1 = new String();
		String cadena2 = new String();
		String resultado = new String();
		int i = 0;
		int j = 0;
		// aquí pedimos al usuario que introduzca las palabras
		System.out.println("Dame una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		/*
		 * mientras que los iteradores sean menores a la longitud de las cadena, en
		 * resultado se almacena el primer caracter (0) de la 1º y uno de la 2º. después
		 * con el i++ y j++ pasan al siguiente caracter y así en bucle.
		 */
		while (i < cadena1.length() && j < cadena2.length()) {
			resultado = resultado + cadena1.charAt(i++);
			resultado = resultado + cadena2.charAt(j++);
		}
		/*
		 * a contunuacion usamos otros dos whiles individuales porque sino el programa
		 * dejaria de escribir caracteres cuando se termine la cadena mas pequeña.
		 */
		while (i < cadena1.length()) {
			resultado = resultado + cadena1.charAt(i++);
		}
		while (j < cadena2.length()) {
			resultado = resultado + cadena2.charAt(j++);
		}
		System.out.println("El resultado de las cadenas intercaladas es: " + resultado);
	}

}
