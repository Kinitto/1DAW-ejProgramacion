package es.studium.Cadenas10;
import java.util.Scanner;

public class Cadenas14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena1=new String();
		String cadena2=new String();
		
		System.out.println("Dame una cadena");
		cadena1=teclado.next();

		cadena2=cadena1;
		System.out.println(cadena2);
		teclado.close();

	}

}
