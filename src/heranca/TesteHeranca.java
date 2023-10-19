package heranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		Produto p = new Livro();
		
		Livro l = new Livro();
		l.nome = "Livro java";
		l.preco = 60;
		l.autor = "abc";
		l.paginas = 250;
		System.out.println(l.toString());
	}

}
