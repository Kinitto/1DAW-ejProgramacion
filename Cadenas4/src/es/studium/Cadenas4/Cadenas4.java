package es.studium.Cadenas4;
import java.util.Scanner;

public class Cadenas4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre1, nombre2, resultado;
		System.out.println("Dame una cadena");
		nombre1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		nombre2 = teclado.nextLine();
		teclado.close();
		resultado=nombre1+" "+nombre2;
		System.out.println(resultado);
	}

}
