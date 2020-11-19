package es.studium.Hopolapa;

import java.util.Scanner;

public class Hopolapa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creamos variables cadena y resultado
		String cadena = new String();
		StringBuilder resul = new StringBuilder();
		
		//pedimos la palabra
		System.out.println("Ingrese una palabra");
		cadena = teclado.nextLine();
		teclado.close();
		//recorremos la palabra desde 0 hasta el maximo de su longitud
		for (int i = 0; i < cadena.length(); i++) {
			//si el caracter es a,e,i,o,u entra en el if
			//usamos el toString para transformar caracter a string y comprobar mayus.
			if (Character.toString(cadena.charAt(i)).equalsIgnoreCase("a")
					|| Character.toString(cadena.charAt(i)).equalsIgnoreCase("e")
					|| Character.toString(cadena.charAt(i)).equalsIgnoreCase("i")
					|| Character.toString(cadena.charAt(i)).equalsIgnoreCase("o")
					|| Character.toString(cadena.charAt(i)).equalsIgnoreCase("u")) {
				//es vocal se escribe el caracter+p+el caracter
				resul.append(cadena.charAt(i) + "p" + cadena.charAt(i));
			} else {
				//si no es vocal se escribe el caracter solo y ya.
				resul.append(cadena.charAt(i));
			}
		}
		System.out.println(resul);
	}
}
