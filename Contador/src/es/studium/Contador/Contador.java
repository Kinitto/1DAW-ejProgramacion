package es.studium.Contador;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int[] contador=new int[2];
        int numero;
        for (int i=0;i<2;i++)
        {
                    contador[i]=0;
        }
        do
        {
                    System.out.println("Indique un número:");
                    numero = teclado.nextInt();
                    if (numero>0)
                    {
                               contador[0]= contador[0]+1;
                    }
                    if (numero<0)
                    {
                               contador[1]= contador[1]+1;
                    }
        }while(numero!=0);
        System.out.println("El número de valores positivos es: "+ contador[0]);
        System.out.println("El número de valores negativos es: "+ contador[1]);
        teclado.close();
}
}
