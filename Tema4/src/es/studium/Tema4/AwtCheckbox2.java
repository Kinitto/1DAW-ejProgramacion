package es.studium.Tema4;

import java.awt.*;
public class AwtCheckbox2 extends Frame
{
private static final long serialVersionUID = 1L;
CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
CheckboxGroup chkgrGrupo2 = new CheckboxGroup();

// Al crear los checkboxes, se indica la etiqueta, si est� o no
// activo y el grupo al que pertenece. En un grupo, solamente
// podr� estar activo un checkbox
Checkbox chkUno = new Checkbox("Opci�n Uno", false, chkgrGrupo1);
Checkbox chkDos = new Checkbox("Opci�n Dos", false, chkgrGrupo1);
Checkbox chkTres = new Checkbox("Opci�n Tres", false, chkgrGrupo1);

Checkbox chk4 = new Checkbox("Opci�n cuatro", false, chkgrGrupo2);
Checkbox chk5 = new Checkbox("Opci�n cinco", false, chkgrGrupo2);
public AwtCheckbox2()
{
setLayout(new FlowLayout());
setTitle("Botones de Opci�n excluyentes");
add(chkUno);
add(chkDos);
add(chkTres);
add(chk4);
add(chk5);
setLocationRelativeTo(null);
setSize(100,150);
setVisible(true);
}
public static void main(String[] args)
{
new AwtCheckbox2();
}
}