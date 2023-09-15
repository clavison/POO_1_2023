package prova1;

public class Instrumento {

	private String nome;
	private String tipo = "Cordas";
	public static char afinado = 'N';
	
	public void cadastra(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String exibir() {
		return getNome() + "(" + getTipo() + ")";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
