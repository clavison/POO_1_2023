package prova1;

public class Questao1 {
	
	public static void main(String[] args) {
		Instrumento i1 = new Instrumento();
		Instrumento i2 = new Instrumento();
		i2.setNome("Guitarra");
		Instrumento i3 = new Instrumento();
		i3.cadastra("Bateria", "Percursão");
		System.out.println(i1.exibir());//(0,25)
		System.out.println(i2.exibir());//(0,25)
		System.out.println(i3.exibir());//(0,25)
		Banda b1 = new Banda();
		b1.cadastra("A", "Rock", 6);
		Banda b2 = new Banda();
		b2.cadastra("B", "POP", 4);
		b1.adicionaInstrumento(i2);
		b2.adicionaInstrumento(i3);
		System.out.println(b1.exibir());//(0,25)
		System.out.println(b2.exibir());//(0,25)
		Instrumento ix = new Instrumento();
		ix.cadastra("Gaita","Percursão");
		b2.getInstrumentos().add(ix);
		Instrumento iy = new Instrumento();
		iy.setNome("Violino");
		b1.getInstrumentos().add(iy);
		System.out.println(b1.exibir());//(0,25)
		System.out.println(b2.exibir());//(0,25)
		System.out.println(b1.soma());//(0,25)
		System.out.println(b2.soma());//(0,25)

	}
}
