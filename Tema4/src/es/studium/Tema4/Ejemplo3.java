package es.studium.Tema4;
import java.awt.Frame;
import java.util.Random;
import java.awt.Color;

public class Ejemplo3 {
	Frame ventana=new Frame();
	Random numAleatorio = new Random();
	Random numAleatorio2 = new Random();
	int aleatorio = numAleatorio.nextInt(1200);
	int aleatorio2 = numAleatorio2.nextInt(800);
	static Color[] colores= {Color.red,Color.yellow};


	public Ejemplo3(int x,int y) {
		ventana.setTitle("Login");
		ventana.setBounds(aleatorio, aleatorio2, 200, 100);
		ventana.setResizable(false);
		ventana.setBackground(Color.GRAY);
		ventana.setVisible(true);
	
	}

	public static void main(String[] args) {
		
		int i,x,y;
		x=10;
		y=10;
		for (i=0;i<50;i++) {
			new Ejemplo3(x,y);
			x=x+10;
			y=y+10;
		}
		

	}

}
