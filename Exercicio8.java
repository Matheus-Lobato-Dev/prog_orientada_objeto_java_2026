import javax.swing.JOptionPane;
public class Exercicio8 {
 public static void main(String[] args) {
 int numero = Integer.parseInt(
 JOptionPane.showInputDialog("Digite um número inteiro:"));
 StringBuilder tabuada = new StringBuilder();
 for (int i = 1; i <= 10; i++) {
 tabuada.append(numero)
 .append(" x ")
 .append(i)
 .append(" = ")
 .append(numero * i)
 .append("\n");
 }
 JOptionPane.showMessageDialog(null, tabuada.toString(),
 "Tabuada", JOptionPane.INFORMATION_MESSAGE);
 }
}