Algoritmo sumasPares_Producto_Impares
	//constantes
	//variables
	entero = suma = producto
	//inicio
	suma = 0 //inicializacion de suma y producto
	producto= 1
	
	Para i<-1 Hasta 40 Con Paso 1 Hacer
		
		
		si i mod 2 = 0 Entonces
			
			suma = suma + i
			
		SiNo
			
			producto = producto * i
			
		FinSi
		
	Fin Para
	
	Escribir "La suma de todos los numeros pares es" " " suma
	Escribir "El producto de los numeros impares es" " " producto
	
FinAlgoritmo
