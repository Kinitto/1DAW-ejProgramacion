package es.studium.Cadenas10;
import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		String cadena1,cadena2;
		
		System.out.println("Dame una cadena");
		cadena1=teclado.nextLine();
		System.out.println("Dame otra cadena");
		cadena2=teclado.nextLine();
		//comparar cadenas alfabeticamente
		if(cadena1.equals(cadena2)) {
			System.out.println("Son iguales");
		}
		else if (cadena1.compareTo(cadena2)>0) {
			
			System.out.println("La primera cadena es mayor");
			
		}
		else {
			System.out.println("La segunda cadena es mayor");

		}
		
		teclado.close();
	}

}
