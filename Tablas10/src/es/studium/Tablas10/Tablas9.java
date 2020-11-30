package es.studium.Tablas10;
import java.util.Scanner;

public class Tablas9 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int FILAS=3;
        final int COLUMNAS=4;
        char tabla[][]=new char[FILAS][COLUMNAS];
        
        
        for(int i=0;i<FILAS;i++) {
        	 for(int j=0;j<COLUMNAS;j++) {
             	System.out.println("Dame el caracter ["+i+"]["+j+"]");
             	tabla[i][j]=teclado.nextLine().charAt(0);
             }
        }
        for(int i=0;i<FILAS;i++) {
       	 for(int j=0;j<COLUMNAS;j++) {
            	System.out.print(tabla[i][j]+"\t");
            }
       	System.out.println();
       }
        
        teclado.close();
	}

}
