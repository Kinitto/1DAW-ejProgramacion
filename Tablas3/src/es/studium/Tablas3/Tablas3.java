package es.studium.Tablas3;
import java.util.Scanner;

public class Tablas3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TAM = 4;
		int [] tabla = new int [TAM];
		int i;
		
		for (i=0;i<TAM;i++) {
			System.out.println("Dame el valor de la tabla["+i+"]:");
			tabla[i]=teclado.nextInt();
		}
		for (i=TAM-1;i>=0;i--) {
			System.out.println(tabla[i]);
		}
		
teclado.close();

	}

}
