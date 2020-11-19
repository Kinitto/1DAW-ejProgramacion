package es.studium.Tallert3;
import java.util.Scanner;
public class BusquedaLineal {

	public static void main(String[] args) {
		
		final int TAM=10;
		int tabla[]=new int [TAM];
		int i;
		boolean encontrado;
		int elemento;
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<TAM;i++){
			System.out.println("Dame un numero entero");
			tabla[i]=teclado.nextInt();
		}
		System.out.println("Dame el elemento que quieres buscar");
		elemento=teclado.nextInt();
		encontrado=false;
		i=0;
		while((!encontrado)&(i<TAM)) {
			if (tabla[i]==elemento){
				encontrado=true;
					}
			else {
				i++;
			}
		}
		if(encontrado) {
			System.out.println("El emento se encontró en la posicion "+i);
		}
		else {
			System.out.println("El elemento buscado no ha sido encontrado");
		}
		teclado.close();
	

	}

}
