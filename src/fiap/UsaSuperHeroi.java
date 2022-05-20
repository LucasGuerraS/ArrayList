package fiap;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsaSuperHeroi {

	public static void main(String[] args) {
		SuperHeroi h1;
		String aux, escolha = "sim", id, nome;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome do heroi");
				id = JOptionPane.showInputDialog("Digite a Identidade secreta do heroi");
				String poder= "continua";
				ArrayList<String> poderes = new ArrayList<String>();
				while (poder.equalsIgnoreCase("continua")) {
					aux = JOptionPane.showInputDialog("Digite o poder do heroi ou \"fim\" para encerrar.");
					if (aux.equalsIgnoreCase("fim")) {
						poder = "fim";
					} else {
						poderes.add(aux);
					}
				}
				String fraqueza = "continua";
				ArrayList<String> fraquezas = new ArrayList<String>();
				while (fraqueza.equalsIgnoreCase("continua")) {
					aux = JOptionPane.showInputDialog("Digite a fraqueza do heroi ou \"fim\" para encerrar.");
					if (aux.equalsIgnoreCase("fim")) {
						fraqueza = "fim";
					} else {
						fraquezas.add(aux);
					}
				}
				h1 = new SuperHeroi(nome, id, poderes, fraquezas);
				h1.listaHeroi();
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!");

	}

}
