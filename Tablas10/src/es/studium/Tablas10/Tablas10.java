package es.studium.Tablas10;

public class Tablas10 {
	public static void main(String[] args) {

	 final int FILAS=9;
     final int COLUMNAS=9;
     int tabla[][]=new int[FILAS][COLUMNAS];
     
     for(int i=0;i<FILAS;i++) {
    	 for(int j=0;j<COLUMNAS;j++) {
         	
    		 tabla[i][j]=i+j;
         }
     }
     for(int i=0;i<FILAS;i++) {
    	 for(int j=0;j<COLUMNAS;j++) {
         	
    	     System.out.print(tabla[i][j]+"\t");

         }
    	 System.out.println();
     }
}
}

