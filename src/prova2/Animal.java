package prova2;

public class Animal {
	String nome;
	String raca;

	public Animal() {
		this.nome = "x";
		this.raca = "y";
	}

	@Override
	public String toString() {
		return nome + "-" + raca;
	}
}
