package Lista01;
import javax.swing.JOptionPane;
public class Losango {
	public static void main (String []args) {

//10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor),
//calcular e escrever a área do losango. Dica a=D.d/2
		
		double dimensoes,D,d;
		
		D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da MAIOR diagonal: "));
		d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da MENOR diagonal: "));
		
		dimensoes = D*d/2;
		
		JOptionPane.showMessageDialog(null,"As dimensões do losando é de: "+dimensoes);
		
		
	}

}



