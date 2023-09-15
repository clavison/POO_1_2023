package prova1;

public class Questao2 {
	
	public static void main(String[] args) {
		Instrumento i1 = new Instrumento();
		i1.setNome("Harpa");
		Instrumento i2 = new Instrumento();
		i2.cadastra("Piano","Percursão");
		Instrumento i3 = new Instrumento();
		i3.setNome(i2.getNome());
		Instrumento i4 = i2;
		i4.setNome("Baixo");
		i4.setTipo("Corda");
		
		System.out.println(i1.exibir());//2a(0,5)
		System.out.println(i2.exibir());//2b(0,5)
		System.out.println(i3.exibir());//2c(0,5)
		System.out.println(i4.exibir());//2d(0,5)
		
		Banda b1 = new Banda();
		b1.cadastra("B1", "pagode", 6);
		Banda b2 = new Banda();
		b2.cadastra("B2", "funk", 5);
		b2.getInstrumentos().add(i1);
		b2.getInstrumentos().add(i3);
		b2.getInstrumentos().add(i4);
		String bandaMaior = b2.getNome();
		if(b1.soma() > b2.soma()) {
			bandaMaior = b1.getNome();
		}
		System.out.println(bandaMaior);//2e(0,5)
		b1.getInstrumentos().add(i1);
		b1.getInstrumentos().add(i3);
		bandaMaior = b2.getNome();
		if(b1.soma() > b2.soma()) {
			bandaMaior = b1.getNome();
		}
		System.out.println(bandaMaior);//2f(0,5)
	}

}
