package view;
import javax.swing.JOptionPane;
import controller.cModulos;

public class principal {
	
	public static void main (String args []) {
		cModulos m = new cModulos();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
		double soma = 0;
		double retorno = m.somaFrac(n, soma);
		System.out.println(retorno);
	}
}
