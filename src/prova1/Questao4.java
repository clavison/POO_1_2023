package prova1;

public class Questao4 {

	public static void main(String[] args) {
		int integrantes = 10;
		transforma(integrantes);
		Banda b = new Banda();
		b.cadastra("A", "B", integrantes);

		System.out.println(b.exibir());// (0,5)

		b.setNrIntegrantes(transformaX(integrantes));

		System.out.println(b.exibir());// (0,5)

		transforma(b);

		System.out.println(b.exibir());// (0,5)
	}

	public static void transforma(Banda x) {
		x.setNome("X");
	}

	public static void transforma(int x) {
		x = x + 2;
	}

	public static int transformaX(int x) {
		return x + 2;
	}
}
