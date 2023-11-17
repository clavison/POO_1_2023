package prova2_rec;

public class PosGraduacao extends Curso{
	public PosGraduacao(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return super.toString()+"(PG)";
	}
}
