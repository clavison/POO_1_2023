package prova2_rec;

public class Q1 {
	
	public static void main(String[] args) {
		Aluno a = new Aluno ("Ana");
		Graduacao g = new Graduacao("G1");
		Doutorado d = new Doutorado("D1");
		g.setVagas(10);
		d.setVagas(3);
		g.fazMatricula(a);
		System.out.println(a);
		a.aprova();
		g.fazMatricula(a);
		a.aprova();
		System.out.println(a);
		d.fazMatricula(a);
		System.out.println(a);
	}

}
