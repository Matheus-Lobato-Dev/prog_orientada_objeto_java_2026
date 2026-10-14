import javax.swing.JOptionPane;

public class Exercicio2{
    public static void main(String[]args){
        double prova = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a nota da prova: "));
        double trabalho = Double.parseDouble(
            JOptionPane.showInputDialog("Nota da Atividade: "));

        double media = (prova*6 + trabalho* 4)/10;

       JOptionPane.showMessageDialog(null,
            String.format("Média ponderada: %.2f", media));
        }



    }
    

