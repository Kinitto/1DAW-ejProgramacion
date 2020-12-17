package es.studium.Tema4;

// Sentencia import para importar las clases que vamos a necesitar
// En este caso necesitaremos las clases del AWT
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

// Declaración de la clase AwtFlow que hereda de la Clase Frame
// Nuestra clase será una Ventana (Frame)
public class AWTFlow extends Frame {
	private static final long serialVersionUID = 1L;
	// Creamos los botones con sus correspondientes etiquetas
	Button btnBoton1 = new Button("Aceptar");
	Button btnBoton2 = new Button("Abrir");
	Button btnBoton3 = new Button("Cerrar");

	// Constructor de la clase con el mismo nombre que ella
	public AWTFlow() {
		// Establecer la distribución del Frame
		setLayout(new FlowLayout());
		// Establecer el título de la aplicación
		setTitle("FlowLayout");
		// Añadir los botones antes creados
		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		// Establecer el tamaño del Frame
		setSize(200, 200);
		// Centra la ventana en la pantalla
		setLocationRelativeTo(null);
		// Mostrar el Frame en pantalla
		setVisible(true);
	}

	// Fin del Constructor
	// Método Main. Es el método que se ejecutará en primer
	// lugar al ejecutarse la aplicación
	public static void main(String[] args) {

		// Crear una instancia u objeto de nuestra Clase AwtFlow
		new AWTFlow();
	}
	// Fin del Main
}
// Fin de la Clase
