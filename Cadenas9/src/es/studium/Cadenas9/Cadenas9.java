package es.studium.Cadenas9;
import java.util.Scanner;

public class Cadenas9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		String subcadena;
		int i, j;
		
		System.out.println("Dame una cadena");
		cadena=teclado.nextLine();
		System.out.println("Dame una posicion base");
		i=teclado.nextInt();
		System.out.println("Dame una longitud");
		j=teclado.nextInt();
		
		for (i=0;i<cadena.length();i++) {
			 subcadena = cadena.substring(i,j);
			System.out.println(subcadena);
			i=cadena.length();
		}
			
		teclado.close();
	}

}
