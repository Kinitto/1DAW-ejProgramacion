package es.studium.Tema4;

import java.awt.*;
public class AwtCheckbox2 extends Frame
{
private static final long serialVersionUID = 1L;
CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
CheckboxGroup chkgrGrupo2 = new CheckboxGroup();

// Al crear los checkboxes, se indica la etiqueta, si está o no
// activo y el grupo al que pertenece. En un grupo, solamente
// podrá estar activo un checkbox
Checkbox chkUno = new Checkbox("Opción Uno", false, chkgrGrupo1);
Checkbox chkDos = new Checkbox("Opción Dos", false, chkgrGrupo1);
Checkbox chkTres = new Checkbox("Opción Tres", false, chkgrGrupo1);

Checkbox chk4 = new Checkbox("Opción cuatro", false, chkgrGrupo2);
Checkbox chk5 = new Checkbox("Opción cinco", false, chkgrGrupo2);
public AwtCheckbox2()
{
setLayout(new FlowLayout());
setTitle("Botones de Opción excluyentes");
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