package Lista01;
import javax.swing.JOptionPane;
public class Divisao {
	public static void main (String []args) {
		
//6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divis�o dos valores.
		
		double numero1, numero2, resultado;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		resultado = numero1/numero2;
		
		JOptionPane.showMessageDialog(null,"A divis�o dos numeros digitados �: "+resultado);
		
		
	}

}