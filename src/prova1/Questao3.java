package prova1;

public class Questao3 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Instrumento i1 = new Instrumento();
		i1.cadastra("Gaita","Percursão");
		i1.afinado = 'S';
		Instrumento i2 = new Instrumento();
		i2.setNome("Viola");
		i2.afinado = 'S';
		Instrumento i3 = new Instrumento();
		i3.cadastra("Saxofone","Sopro");
		i3.afinado = 'N';
		Banda b1 = new Banda();
		b1.cadastra("B1", "Sertanejo", 2);
		b1.adicionaInstrumento(i1);
		b1.adicionaInstrumento(i2);
		b1.adicionaInstrumento(i3);
		for (Instrumento i : b1.getInstrumentos()) {
			System.out.println(i.afinado);
			//Serão escritas 3 linhas
			//3a (0,25)
			//3b (0,25)
			//3c (0,25)
		}
		Instrumento.afinado = 'S';
		for (Instrumento i : b1.getInstrumentos()) {
			System.out.println(i.afinado);
			//Serão escritas 3 linhas
			//3d (0,25)
			//3e (0,25)
			//3f (0,25)
		}
	}

}
