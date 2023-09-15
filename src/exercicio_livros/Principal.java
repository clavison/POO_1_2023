package exercicio_livros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = escolheMenu();
			switch (op) {
			case 1:
				cadastra();
				break;
			case 2:
				buscarAutor();
				break;
			case 3:
				buscarPorVl();
				break;
			case 4:
				buscarCrianca();
				break;
			case 5:
				buscarAutorExclusivo();
				break;

			}
		}while(op != 6);
	}
	
	private static int escolheMenu() {
		String menu = "1 - Cadastrar Livro\n"
				+ "2 - Buscar por autor\n"
				+ "3 - Pesquisar por faixa de valor\n"
				+ "4 - Buscar por livros que tenham crianças como autor\n"
				+ "5 - Buscar por livro somente com autor masculino ou feminino\n\n"
				+ "6 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	private static void cadastra() {
		Livro l = new Livro();
		l.cadastra();
		livros.add(l);
	}
	
	private static void buscarAutor() {
		String ret = "Busca de livros por autor:\n";
		String autor = JOptionPane.showInputDialog("Buscar por autor com o nome:");
		for (Livro livro : livros) {
			if(livro.temAutor(autor)) {
				ret += livro.exibir();
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	private static void buscarCrianca() {
		String ret = "Busca de livros por autor menor de idade:\n";
		for (Livro livro : livros) {
			if(livro.temCrianca()) {
				ret += livro.exibir();
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	private static void buscarAutorExclusivo() {
		String ret = "Busca de livros por autores Masc ou Fem:\n";
		String sexo = JOptionPane.showInputDialog("Qual sexo:");
		for (Livro livro : livros) {
			if(livro.autorSexoExclusivo(sexo)) {
				ret += livro.exibir();
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	private static void buscarPorVl() {
		String ret = "Busca de livros por valor:\n";
		double vi = Double.parseDouble(JOptionPane.showInputDialog("Valor inicial:"));
		double vf = Double.parseDouble(JOptionPane.showInputDialog("Valor final:"));
		for (Livro livro : livros) {
			if(livro.getPreco() >= vi && livro.getPreco() <= vf) {
				ret += livro.exibir();
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	

}
