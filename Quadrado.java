package Lista01;
import javax.swing.JOptionPane;
public class Quadrado {
	public static void main (String []args) {

//9) Escreva um algoritmo para ler as dimens�es de um quadrado (lado), calcular e escrever a �rea do quadrado. Dica a=l�
		double l, a;
		
		l = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
		
		a = l*l;
		
		JOptionPane.showMessageDialog(null,"A �rea do quadrado �: "+a);
		
		
	}

}

