package es.studium.Cadenas10;

import java.util.Scanner;

public class Cadenas12 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		final int TAM = 4;
		String tabla[]=new String[TAM];
		String mayor;
		//comparar cadenas alfabeticamente
		for(int i=0;i<TAM;i++) {
			System.out.println("Dame una cadena "+i);
			tabla[i]=teclado.nextLine();
		}
		
		mayor=tabla[0];
		
		for(int i=0;i<TAM;i++) {
			if (tabla[i].compareTo(mayor)>0) {
				mayor=tabla[i];
			}
		}
			System.out.println("La cadena mayor es "+mayor);
		teclado.close();
	}

}
