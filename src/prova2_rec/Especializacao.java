package prova2_rec;

public class Especializacao extends PosGraduacao{
	
	public Especializacao(String nome) {
		super(nome);
	}
	
	@Override
	public void fazMatricula(Aluno a) {
		if(a.getNivel() > 0) {
			super.fazMatricula(a);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+": Espec";
	}

}
