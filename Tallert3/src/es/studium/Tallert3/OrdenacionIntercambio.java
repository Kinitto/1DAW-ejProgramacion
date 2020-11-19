package es.studium.Tallert3;
import java.util.Scanner;

public class OrdenacionIntercambio {
	public static void main(String[] args) {
	final int TAM=10;
	int tabla[]=new int [TAM];
	int i,j,aux;
	Scanner teclado = new Scanner(System.in);
	for(i=0;i<TAM;i++){
		System.out.println("Dame un numero entero");
		tabla[i]=teclado.nextInt();
	}
	
	for(i=0;i<TAM-1;i++) {
		for(j=i+1;j<TAM;j++) {
			if (tabla[i]>tabla[j]) {
				aux=tabla[i];
				tabla[i]=tabla[j];
				tabla[j]=aux;	
			}
		}
	}
	System.out.println("Tabla ordenada:");
	for(i=0;i<TAM;i++){
		System.out.println(tabla[i]);
		}
	}
}