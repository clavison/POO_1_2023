package b_encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0 && idade < 110) {
			this.idade = idade;
		}
	}

}
