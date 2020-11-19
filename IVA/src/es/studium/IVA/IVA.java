package es.studium.IVA;

import java.util.Scanner;

public class IVA {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * creamos las variables, resultado la puse como float para que de el resultado
		 * con sus decimales
		 */
		int cantidad, iva;
		float resultado;

		do {
			// pedimos el iva y el coste.
			System.out.println("Dame una IVA:");
			iva = teclado.nextInt();
			System.out.println("Dame una cantidad monetaria:");
			cantidad = teclado.nextInt();
			// calculamos el iva con la mascara flaot para tener decimales en el resultado
			resultado = ((float) cantidad * (float) iva) / 100;
			System.out.println("El iva correspondiente del producto es " + resultado);
			// indicamos que mientras cantidad sea distinto a 0 siga haciendo bucle.
		} while (cantidad != 0);
		teclado.close();
	}
}
