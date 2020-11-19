package es.studium.Traductor;

import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String resul = new String();
		String[][] diccionario = new String[9][9];

		cargarDiccionario(diccionario);

		System.out.println("Introduce una frase en español o ingles");
		String frase = teclado.nextLine();

		//Divide la frase por espacios " " y lo almacena en un array
		String[] fraseSeparada = frase.split(" ");

		for (int i = 0; i < fraseSeparada.length; i++) {
			resul = resul + encontrarPalabraDiccionario(fraseSeparada[i], diccionario) + " ";
		}

		System.out.println(resul);
		teclado.close();
	}

	public static void cargarDiccionario(String[][] diccionario) {
		// español
		diccionario[0][0] = "Yo";
		diccionario[0][1] = "Tu";
		diccionario[0][2] = "El";
		diccionario[0][3] = "Ella";
		diccionario[0][4] = "Soy";
		diccionario[0][5] = "Eres";
		diccionario[0][6] = "Es";		
		diccionario[0][7] = "Alto";
		diccionario[0][8] = "Bajo";
		// ingles
		diccionario[1][0] = "I";
		diccionario[1][1] = "You";
		diccionario[1][2] = "He";
		diccionario[1][3] = "She";
		diccionario[1][4] = "Am";
		diccionario[1][5] = "Are";
		diccionario[1][6] = "Is";
		diccionario[1][7] = "Tall";
		diccionario[1][8] = "Short";
	}

	/**
	 * Encuentra la palabra y si existe te devuelve la traducción
	 * 
	 * @param palabra
	 * @param diccionario
	 * @return String
	 */
	public static String encontrarPalabraDiccionario(String palabra, String[][] diccionario) {
		String palabraEncontrada = new String();

		
		//Recorre el diccionario en español, si la palabra es encontrada se guarda en ingles
		for (int i = 0; i < diccionario.length; i++) {
			if (diccionario[0][i].equalsIgnoreCase(palabra)) {
				palabraEncontrada = diccionario[1][i];
			}
		}

		for (int i = 0; i < diccionario.length; i++) {
			if (diccionario[1][i].equalsIgnoreCase(palabra)) {
				palabraEncontrada = diccionario[0][i];
			}
		}

		return palabraEncontrada;
	}

}
