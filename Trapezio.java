package Lista01;
import javax.swing.JOptionPane;
public class Trapezio {
	public static void main (String []args) {

//11) Escreva um algoritmo para ler as dimens�es de um trap�zio (base maior, base menor e altura), 
//calcular e escrever a �rea do trap�zio. a=(B+b).h/2
		
		double h,B,b,a;
		
		B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da MAIOR base: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da MENOR base: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		a = (B+b)*h/2;
		
		JOptionPane.showMessageDialog(null,"A �rea do trap�zio: "+a);
		
		
	}

}

