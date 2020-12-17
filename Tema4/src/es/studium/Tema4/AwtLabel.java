package es.studium.Tema4;

import java.awt.*;

public class AwtLabel extends Frame {
	private static final long serialVersionUID = 1L;
	Label lblEtiqueta = new Label("Cervantes");

	public AwtLabel() {
		setLayout(new FlowLayout());
		setTitle("Etiqueta");
		add(lblEtiqueta);
		setLocationRelativeTo(null);
		setSize(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtLabel();
	}
}