package es.studium.Tablas10;
import java.util.Scanner;

public class Tablas11 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FILAS=3;
        final int COLUMNAS=3;
        int i=0;
        int j=0;
        boolean a=true;
        int tabla[][]=new int[FILAS][COLUMNAS];
        
        for( i=0;i<FILAS;i++) {
        	for (j=0;j<COLUMNAS;j++){
        		
        		System.out.println("Dame la posicion["+i+"]["+j+"]");
        		tabla[i][j]=teclado.nextInt();
        	}
        }
        

        for( i=0;i<FILAS;i++) {
        	for (j=0;j<COLUMNAS;j++){
        		
        		if(tabla[i][j]!=tabla[j][i]) {
        	        a=false;
        		}
        	}
        }
        	
        if(a==true) {
        	System.out.println("Son iguales");
        	
        }
        else {
        	System.out.println("No son iguales");
        }
       
        teclado.close();

	}

}
