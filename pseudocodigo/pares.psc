Algoritmo pares
	//constantes
	//variables
	entero = num1
	entero = num2
	entero = contador
	//inicio
	Escribir "dame un numero entero"
	leer num1
	Escribir "dame otro numero entero"
	leer num2
	
	Si num1<= num2 Entonces
		
		Para i<-num1 Hasta num2 Con Paso 1 Hacer
		
		si i mod 2 = 0 Entonces
			Escribir i
		FinSi
		
	Fin Para
	
SiNo
	Escribir "error, el primer numero debe ser igual o menor que el segundo"
	Escribir "pero por esta vez te lo perdono!"
	Para i<-num2 Hasta num1 Con Paso 1 Hacer
		si i mod 2 = 0 Entonces
			Escribir i
		FinSi
	FinPara
	FinSi
	

FinAlgoritmo
