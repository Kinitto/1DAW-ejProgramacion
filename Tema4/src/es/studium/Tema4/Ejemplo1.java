package es.studium.Tema4;


import java.awt.Color;
import java.awt.Frame;

public class Ejemplo1 {
	
	Frame ventana=new Frame();
	
	public Ejemplo1() {
		
		ventana.setTitle("Login");
		ventana.setBounds(50, 50, 500, 220);
		ventana.setResizable(false);
		ventana.setBackground(Color.GRAY);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Ejemplo1();

	}

}
