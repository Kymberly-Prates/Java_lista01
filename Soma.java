package Lista01;
import javax.swing.JOptionPane;
public class Soma {
	public static void main (String []args) {

//3) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a soma dos valores.
		double numero1, numero2, resultado;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		resultado = numero1+numero2;
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros digitados �: "+resultado);
		
		
	}

}