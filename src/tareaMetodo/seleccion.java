package tareaMetodo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SeleccionSortGUI extends JFrame {
    
    private JButton sortButton, resetButton;
    private JTextArea inputArea, outputArea;
    private JScrollPane scrollPane1, scrollPane2;

    public SeleccionSortGUI() {
        // Configurar la ventana principal
        super("Selección Sort GUI");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar las áreas de texto
        inputArea = new JTextArea(10, 30);
        outputArea = new JTextArea(10, 30);
        scrollPane1 = new JScrollPane(inputArea);
        scrollPane2 = new JScrollPane(outputArea);
        
        // Configurar los botones
        sortButton = new JButton("Ordenar");
        resetButton = new JButton("Resetear");

        // Configurar el panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane1, BorderLayout.WEST);
        mainPanel.add(scrollPane2, BorderLayout.EAST);
        
        // Configurar el panel de botones
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(sortButton);
        buttonPanel.add(resetButton);
        
        // Agregar los paneles al frame principal
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Agregar un listener al botón de ordenar
        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener la entrada del usuario
                String inputText = inputArea.getText();
                // Convertir la entrada a un array de enteros
                String[] stringArray = inputText.split("\\s+");
                int[] intArray = new int[stringArray.length];
                for (int i = 0; i < stringArray.length; i++) {
                    intArray[i] = Integer.parseInt(stringArray[i]);
                }
                // Ordenar el array usando selección sort
                int[] sortedArray = seleccionSort(intArray);
                // Mostrar el resultado en el área de texto de salida
                String outputText = "";
                for (int i = 0; i < sortedArray.length; i++) {
                    outputText += sortedArray[i] + " ";
                }
                outputArea.setText(outputText);
            }
        });

        // Agregar un listener al botón de resetear
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar las áreas de texto
                inputArea.setText("");
                outputArea.setText("");
            }
        });
        
        // Mostrar la ventana principal
        setVisible(true);
    }

    // Implementar el algoritmo de selección sort
    public static int[] seleccionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Ejecutar la aplicación
    public static void main(String[] args) {
        new selectiva();
    }
}