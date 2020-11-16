package es.studium.Veces;
import java.util.Scanner;

public class Veces 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2, i;
		System.out.println("Dame un numero entero");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero");
		num2 = teclado.nextInt();
		teclado.close();
		
		for (i=1;i<=num1;i++)
		{
			System.out.println(num2);
		}
	}

}
