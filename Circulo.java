package Lista01;
import javax.swing.JOptionPane;
public class Circulo {
	public static void main (String []args) {

//12) Escreva um algoritmo para ler as dimensões de um círculo (raio), calcular e escrever a área do círculo. a=pi*r²
		
		double r,a;
		
		r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do circulo: "));
		
		a=3.14*r*r;
		
		JOptionPane.showMessageDialog(null,"A área total do circulo é: "+a);
		
		
	}

}


