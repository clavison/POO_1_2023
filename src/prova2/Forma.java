package prova2;

public class Forma {
	
	protected String nome;
	public Forma(String nome) {
		this.nome = nome;
		System.out.println("Criando "+getNome());
	}
	public void desenhar () {
		System.out.println("Desenhando " + getNome());
	}
	@Override
	public String toString() {
		return "Eu sou um(a): " + getNome();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
