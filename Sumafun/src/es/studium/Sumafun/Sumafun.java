package es.studium.Sumafun;
import java.util.Scanner;

public class Sumafun 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		int resultado;
		
		System.out.println("Dame un numero");
		num1=teclado.nextInt();
		System.out.println("Dame otro numero");
		num2=teclado.nextInt();

		resultado=sumafun(num1,num2);
		System.out.println("el resultado es " + resultado);
		teclado.close();

	}
	public static int sumafun(int a, int b)
	{
	int resultado;
	resultado=a+b;
	return(resultado);
	}
}
