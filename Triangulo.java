package Lista01;
import javax.swing.JOptionPane;
public class Triangulo {
	public static void main (String []args) {

//8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo.
//Dica a=b.h/2
		double b, h, a;
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		a = b*h/2;
		
		JOptionPane.showMessageDialog(null,"A área do triangulo é: "+a);
		
		
	}

}

