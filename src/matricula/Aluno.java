package matricula;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String nome;
	private ArrayList<Disciplina> discMatriculadas = new ArrayList<Disciplina>();
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do aluno"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Disciplina> getDiscMatriculadas() {
		return discMatriculadas;
	}
	public void setDiscMatriculadas(ArrayList<Disciplina> discMatriculadas) {
		this.discMatriculadas = discMatriculadas;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	
	

}
