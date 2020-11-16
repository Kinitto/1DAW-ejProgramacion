package es.studium.SumaPares;

public class SumaPares 
{

	public static void main(String[] args)
	{
		int suma, producto, i;
		suma=0;
		producto=1;
		
		for (i=1;i<=40;i++)
		{
			if (i%2==0)
			{
				suma=i+suma;
			}
			else
			{
				producto=i*producto;
			}
		}
		
		System.out.println("La suma de los 20 primeros pares vale " + suma);
		System.out.println("El producto de los 20 impares pares vale " + producto);

	}

}
