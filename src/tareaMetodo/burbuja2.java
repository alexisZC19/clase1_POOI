import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class burbuja2 extends JFrame {
private JLabel lbArray, lbSortedArray;
private JTextField tfArray, tfSortedArray;
private JButton btnSort;

public burbuja2() {
super("Método de ordenamiento Burbuja");

// Inicializar componentes de la GUI
lbArray = new JLabel("Arreglo:");
tfArray = new JTextField(20);
lbSortedArray = new JLabel("Arreglo ordenado:");
tfSortedArray = new JTextField(20);
tfSortedArray.setEditable(false);
btnSort = new JButton("Ordenar");

// Agregar componentes a la GUI
Container c = getContentPane();
c.setLayout(new GridLayout(3, 2));
c.add(lbArray);
c.add(tfArray);
c.add(lbSortedArray);
c.add(tfSortedArray);
c.add(btnSort);

// Agregar ActionListener al botón
btnSort.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
// Obtener arreglo del cuadro de texto
String input = tfArray.getText();
String[] inputArray = input.split(",");
int[] nums = new int[inputArray.length];
for (int i = 0; i < inputArray.length; i++) {
nums[i] = Integer.parseInt(inputArray[i].trim());
}

// Ordenar el arreglo utilizando el método de burbuja
for (int i = 0; i < nums.length; i++) {
for (int j = 0; j < nums.length - i - 1; j++) {
if (nums[j] > nums[j + 1]) {
int temp = nums[j];
nums[j] = nums[j + 1];
nums[j + 1] = temp;
}
}
}

// Mostrar arreglo ordenado en el cuadro de texto
StringBuilder sb = new StringBuilder();
for (int i = 0; i < nums.length; i++) {
sb.append(nums[i]);
if (i != nums.length - 1) {
sb.append(", ");
}
}
tfSortedArray.setText(sb.toString());
}
});

// Configurar tamaño de la ventana y mostrarla
setSize(300, 150);
setVisible(true);
}

public static void main(String[] args) {
new burbuja2();
}
}