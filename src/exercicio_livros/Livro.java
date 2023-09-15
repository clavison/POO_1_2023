package exercicio_livros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
	private double preco;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	
	public void cadastra() {
		setTitulo(JOptionPane.showInputDialog("Título"));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
		String continua = "";
		do {
			Autor a = new Autor();
			a.cadastra();
			autores.add(a);
			continua = JOptionPane.showInputDialog("Incluir mais autores? (S ou N)");
		}while(continua.equalsIgnoreCase("S"));
		if(!validarDados()) {
			JOptionPane.showMessageDialog(null, "Lamento!!! Cadastre novamente!");
			cadastra();
		}
	}
	
	public String exibir() {
		String ret = getTitulo()+" - R$" + + getPreco()+"\n"; 
		for (Autor autor : autores) {
			ret += autor.exibir();
		}
		ret += "\n";
		return ret;
	}
	
	private boolean validarDados() {
		if(preco <= 0) {
			JOptionPane.showMessageDialog(null, "Preço inválido");
			return false;
		}
		if(autores.size() > 4) {
			JOptionPane.showMessageDialog(null, "Número de autores maior que os permitido");
			return false;
		}
		return true;
	}
	
	public boolean autorSexoExclusivo(String sexo) {
		boolean exclusivo = true;
		for (Autor autor : autores) {
			if(!autor.getSexo().equalsIgnoreCase(sexo)) {
				exclusivo = false;
			}
		}
		return exclusivo;
	}
	
	public boolean temAutor(String nome) {
		for (Autor autor : autores) {
			if(autor.getNome().contains(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean temCrianca() {
		for (Autor autor : autores) {
			if(autor.getIdade() <= 12) {
				return true;
			}
		}
		return false;
	}
	
	
	public String getTitulo() {
		return titulo.toLowerCase();
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	
	

}
