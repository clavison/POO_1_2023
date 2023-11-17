package prova2_rec;

public class Doutorado extends PosGraduacao{
	public Doutorado(String nome) {
		super(nome);
	}
	@Override
	public void fazMatricula(Aluno a) {
		if(a.getNivel() >= 2) {
			super.fazMatricula(a);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+": Doutorado";
	} 

}
