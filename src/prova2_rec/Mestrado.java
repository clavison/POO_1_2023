package prova2_rec;

public class Mestrado extends PosGraduacao{
	public Mestrado(String nome) {
		super(nome);
	}
	@Override
	public void fazMatricula(Aluno a) {
		if(a.getNivel() >= 1) {
			super.fazMatricula(a);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+": Mestrado";
	} 
}
