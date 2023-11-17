package prova2_rec;

public class Q2 {
	
	public static void main(String[] args) {
		Graduacao g1 = new Graduacao("G1");
		Mestrado m1 = new Mestrado("M1");
		Doutorado d1 = new Doutorado("D1");
		g1.setVagas(2);
		m1.setVagas(2);
		d1.setVagas(1);
		Aluno a1 = new Aluno ("Pedro");
		Aluno a2 = new Aluno ("Maria");
		g1.fazMatricula(a1);
		g1.fazMatricula(a2);
		System.out.println(a1);
		System.out.println(a2);
		a1.aprova();
		m1.fazMatricula(a1);
		m1.fazMatricula(a2);
		a1.aprova();
		a2.aprova();
		System.out.println(a1);
		System.out.println(a2);
		a1.aprova();
		a2.setNivel(a1.getNivel());
		System.out.println(a1);
		System.out.println(a2);
		d1.fazMatricula(a2);
		d1.fazMatricula(a1);
		System.out.println(a1);
		System.out.println(a2);
	}

}
