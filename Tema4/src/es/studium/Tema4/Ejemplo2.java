package es.studium.Tema4;

import java.awt.Color;
import java.awt.Frame;

public class Ejemplo2 extends Frame {
	
public Ejemplo2() {
	
		setTitle("Login");	
		setBounds(50, 50, 500, 220);
		setResizable(false);
		setBackground(Color.GRAY);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Ejemplo2();
	}

}
