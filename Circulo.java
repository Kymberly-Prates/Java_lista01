package Lista01;
import javax.swing.JOptionPane;
public class Circulo {
	public static void main (String []args) {

//12) Escreva um algoritmo para ler as dimens�es de um c�rculo (raio), calcular e escrever a �rea do c�rculo. a=pi*r�
		
		double r,a;
		
		r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do circulo: "));
		
		a=3.14*r*r;
		
		JOptionPane.showMessageDialog(null,"A �rea total do circulo �: "+a);
		
		
	}

}


