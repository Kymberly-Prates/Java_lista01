package Lista01;
import javax.swing.JOptionPane;
public class Triangulo {
	public static void main (String []args) {

//8) Escreva um algoritmo para ler as dimens�es de um tri�ngulo (base e altura), calcular e escrever a �rea do tri�ngulo.
//Dica a=b.h/2
		double b, h, a;
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		a = b*h/2;
		
		JOptionPane.showMessageDialog(null,"A �rea do triangulo �: "+a);
		
		
	}

}

