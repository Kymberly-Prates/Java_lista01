package Lista01;
import javax.swing.JOptionPane;
public class Menos {
	public static void main (String []args) {

//4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.
		
		double numero1, numero2, resultado;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		resultado = numero1-numero2;
		
		JOptionPane.showMessageDialog(null,"A subtração dos numeros digitados é: "+resultado);
		
		
	}

}