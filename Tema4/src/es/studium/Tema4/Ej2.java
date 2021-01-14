package es.studium.Tema4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ej2 extends Frame {
	private static final long serialVersionUID = 1L;
	Frame ventana = new Frame("Calcular el iva");
	Label lblcantidad = new Label("Introduzca la cantidad");
	Label lblporcentaje = new Label("Introduzca el porcentaje");
	TextField txtCantidad = new TextField(20);
	TextField txtPorcentaje = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("Resultado");
	TextField txtCalcular = new TextField(30);




	public Ej2() {
		ventana.setLayout(new FlowLayout());
		ventana.add(lblcantidad);
		ventana.add(txtCantidad);
		ventana.add(lblporcentaje);
		ventana.add(txtPorcentaje);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txtCalcular);
		ventana.setSize(350,200);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Ej2();
	}
}