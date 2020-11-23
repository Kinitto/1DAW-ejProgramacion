package es.studium.Cadenas10;
import java.util.Scanner;

public class Cadenas10 {

	public static void main(String[] args) {
		String cadena;
		int longitud;
		String resultado="";
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Dame una longitud: ");
		longitud = teclado.nextInt();
		teclado.close();

		System.out.println(cadena.substring(cadena.length()-longitud, cadena.length()));

		for (int i = cadena.length()-longitud; i < cadena.length(); i++) {
			resultado = resultado+cadena.charAt(i);
		}
		System.out.println(resultado);
	}

}