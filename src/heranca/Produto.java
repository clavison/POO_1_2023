package heranca;

public class Produto {
	
	protected String nome;
	protected double preco;
	
	Produto(String nome){
		this.nome = nome;
	}
	
	Produto(){
		this("");
	}
	
	public boolean ehCaro() {
		return preco > 100;
	}
	
	@Override
	public String toString() {
		return nome + " - " + preco;
	}

}
