package Lista01;
import javax.swing.JOptionPane;
public class Losango {
	public static void main (String []args) {

//10) Escreva um algoritmo para ler as dimens�es de um losango (diagonal maior, diagonal menor),
//calcular e escrever a �rea do losango. Dica a=D.d/2
		
		double dimensoes,D,d;
		
		D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da MAIOR diagonal: "));
		d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da MENOR diagonal: "));
		
		dimensoes = D*d/2;
		
		JOptionPane.showMessageDialog(null,"As dimens�es do losando � de: "+dimensoes);
		
		
	}

}



