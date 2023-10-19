package heranca;

public class Livro extends Produto{
	
	public String autor;
	public int paginas;
	
	
	
	public boolean ehGrande() {
		return paginas > 200;
	}
	
	@Override
	public boolean ehCaro() {
		return preco > 50;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + autor + " - " + paginas;
	}

}
