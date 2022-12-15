package Lista01;
import javax.swing.JOptionPane;
public class Retangulo {
	public static void main (String []args) {

//7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever *a área do retângulo.
//Dica a=b.h
		double b, h, a;
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		a = b*h;
		
		JOptionPane.showMessageDialog(null,"A área do retangulo é: "+a);
		
		
	}

}

