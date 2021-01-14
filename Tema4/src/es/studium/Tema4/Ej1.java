package es.studium.Tema4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ej1 implements WindowListener, ActionListener{
	
	Frame ventana = new Frame("conversion de temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(20);
	TextField txtFahrenheit = new TextField(20);
	Button btnCelsius = new Button("Celsius a Fahrenheit");
	Button btnFahrenheit = new Button("Fahrenheit a Celsius");



	public Ej1() {
		ventana.addWindowListener(this);
		ventana.setLayout(new GridLayout(3, 2));
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		ventana.add(btnCelsius);
		ventana.add(btnFahrenheit);
		ventana.setSize(650,150);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Ej1();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}