package Lista01;
import javax.swing.JOptionPane;
public class Retangulo {
	public static void main (String []args) {

//7) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever *a �rea do ret�ngulo.
//Dica a=b.h
		double b, h, a;
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		a = b*h;
		
		JOptionPane.showMessageDialog(null,"A �rea do retangulo �: "+a);
		
		
	}

}

