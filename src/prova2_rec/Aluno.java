package prova2_rec;

public class Aluno {
	
	private String nome;
	private Curso curso;
	private int nivel = 0;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	public void aprova() {
		nivel ++;
	}
	@Override
	public String toString() {
		return getNome()+"-"+curso+"-"+getNivel();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	

}
