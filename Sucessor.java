package Lista01;

import javax.swing.JOptionPane;
public class Sucessor {
	public static void main(String []args){
	
//1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.
		
		int valor1, sucessor;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja saber o seu sucessor: "));
		
		sucessor = valor1 + 1;
		
		JOptionPane.showMessageDialog(null,"O antecessor do numero "+valor1+" é: "+sucessor);
	}

}
