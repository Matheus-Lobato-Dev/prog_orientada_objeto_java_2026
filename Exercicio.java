import javax.swing.JOptionPane;

public class Exercicio  {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Temperatura em Celsius: ");
        double celsius = Double.parseDouble(entrada);
        double fahrenheit = (celsius * 1.8 + 32);

        JOptionPane.showMessageDialog(null,
            String.format("Temperatura em Fahrenheit: %.2f", fahrenheit));

    }






}