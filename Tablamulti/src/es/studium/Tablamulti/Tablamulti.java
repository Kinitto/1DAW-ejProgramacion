package es.studium.Tablamulti;
import java.util.Scanner;

public class Tablamulti 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int num1, i;
		System.out.println("Dame un numero");
		num1=teclado.nextInt();
		teclado.close();
		
		for (i=0;i<=10;i++)
		{
			System.out.println(i+" Multiplicado por "+num1+" es igual a "+(i*num1));
		}
	}

}
