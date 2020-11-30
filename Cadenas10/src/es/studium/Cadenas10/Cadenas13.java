package es.studium.Cadenas10;
import java.util.Scanner;

public class Cadenas13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = new String();
		StringBuilder resultado = new StringBuilder();
		char letra='o';
		
		System.out.println("Ingrese una frase");
		cadena = teclado.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
		
			if (Character.toString(cadena.charAt(i)).equalsIgnoreCase("a")){
				
				resultado.append(cadena.charAt(i));
			} else {
				//si no es vocal se escribe el caracter solo y ya.
				resultado.append(cadena.charAt(i));
			}
		}
		System.out.println(resultado);
		teclado.close();
	}

}
