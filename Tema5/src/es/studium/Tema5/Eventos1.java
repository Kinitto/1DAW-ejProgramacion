package es.studium.Tema5;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Eventos1 implements WindowListener, ActionListener {

	Frame ventana = new Frame();
	Button btnaceptar = new Button("Aceptar");
	Button btncancelar = new Button("Cancelar");
	Dialog mensaje;
	Label lblmensaje;
	
	public Eventos1() {

		btnaceptar.addActionListener(this);
		btncancelar.addActionListener(this);
		ventana.add(btnaceptar);
		ventana.add(btncancelar);
		ventana.addWindowListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setSize(250, 100);
		ventana.setLayout(new FlowLayout());
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Eventos1();
	}

	public void actionPerformed(ActionEvent evento) {
		mensaje = new Dialog(ventana,"mensaje",true);
		lblmensaje= new Label("XXXXXXXXXXXX");
		mensaje.addWindowListener(this);
		mensaje.setResizable(false);
		mensaje.setSize(250, 100);
		mensaje.setLayout(new FlowLayout());
		if (evento.getSource().equals(btnaceptar)) {
			
			lblmensaje.setText("Aceptar...");
		}
		else {
			lblmensaje.setText("Cancelar...");
		}
		mensaje.add(lblmensaje);
		mensaje.setVisible(true);
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
		if(mensaje.isActive()) {
			
			mensaje.setVisible(false);
		}
		else {
			
			System.exit(0);

		}
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

}
