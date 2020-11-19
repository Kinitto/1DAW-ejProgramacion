package es.studium.Adivina;

//generamos el import random para poder crear el numero aleatorio
import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random numAleatorio = new Random();
		/*
		 * usamos el objeto aleatorio para crear la variable int que le asignamos el
		 * numero aleatorio del 1 al 5. se le pone en 1 + numaleatorio porque sino
		 * contaria desde el 0 al 5 y queremos que cuente desde el 1
		 */
		int aleatorio = 1 + numAleatorio.nextInt(5);
		int numero;
		// pedimos al usuario que introduzca un numero
		System.out.println("Introduce un numero del 1 al 5,¡Suerte!");
		numero = teclado.nextInt();
		/*
		 * por ultimo con la funcion if hacemos que te diga si tu numero y el aleatorio
		 * son iguales o no. puse como primera opcion el no(!=) porque es mas probable
		 * que suceda.
		 */
		if (numero != aleatorio) {
			System.out.println("¡Has fallado!, el numero aletorio es " + aleatorio);
		} else {
			System.out.println("¡Acertaste!, el numero aletorio es " + aleatorio);
		}
		teclado.close();
	}

}
