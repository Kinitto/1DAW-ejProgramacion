package es.studium.Tablas10;
import java.util.Scanner;

public class Tablas8 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TAM=10;
        int tabla[]=new int[TAM];
        int maximo;
        //rellenamos
        //recorrer max
        //recorrer para posicion maximoS
        for(int i=0;i<TAM;i++) {
        	System.out.println("Dame el valor de la posicion "+i);
        	tabla[i]=teclado.nextInt();
        }
        //suponemos que el maximo es el primero
        maximo=tabla[0];
        for(int i=0;i<TAM;i++) {
        	if (tabla[i]>maximo) {
        		maximo=tabla[i];
        	}
        }
        System.out.println("El maximo vale "+maximo);
        for(int i=0;i<TAM;i++) {
        	if (tabla[i]==maximo) {
        		System.out.println("El maximo se encuentra en "+i);
        	}
        }
teclado.close();
	}

}
