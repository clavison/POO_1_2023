package prova2_rec;

public class Graduacao extends Curso{
	public Graduacao(String nome) {
		super(nome);
	}
	@Override
	public String toString() {
		return super.toString()+"(Graduação)";
	}
}
