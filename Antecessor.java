package Lista01;

import javax.swing.JOptionPane;

public class Antecessor {
	public static void main(String []args) {
		
//2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
		int valor1,antecessor;
		
valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja saber o seu antecessor: "));
		
antecessor = valor1 - 1;
		
		JOptionPane.showMessageDialog(null,"O antecessor do numero "+valor1+" é: "+antecessor);
	}

}
