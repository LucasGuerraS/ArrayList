package fiap;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome, idSecreta;
	private ArrayList<String> poderes, fraquezas;
	public SuperHeroi() {
	}
	
	public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
		this.nome = nome;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
		this.fraquezas = fraquezas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdSecreta() {
		return idSecreta;
	}

	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}

	public ArrayList<String> getPoderes() {
		return poderes;
	}

	public void setPoderes(ArrayList<String> poderes) {
		this.poderes = poderes;
	}

	public ArrayList<String> getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(ArrayList<String> fraquezas) {
		this.fraquezas = fraquezas;
	}
	
	public void listaHeroi() {
		int cont = 1, cont2 = 1;
		String exibe = "Poderes: \n";
		for (String i : poderes) {
			exibe += "Poder " + cont + ": " + i + "\n";
			cont ++;
		}
		
		String exibe2 = "Fraquezas: \n";
		for (String i : fraquezas) {
			exibe2 += "Fraqueza " + cont2 + ": " + i + "\n";
			cont2 ++;
		}
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" +
				"Identidade Secreta: " + idSecreta + "\n" + exibe + "\n" + exibe2);
	}
	
	
	
	
}
