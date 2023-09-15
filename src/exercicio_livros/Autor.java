package exercicio_livros;

import javax.swing.JOptionPane;

public class Autor {

	private String nome;
	private String sexo;
	private int idade;

	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome"));
		setSexo(JOptionPane.showInputDialog("Sexo:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
	}

	public String exibir() {
		return getNome() + "-" + getSexo() + "-" + getIdade() + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (temDuasPalavras(nome)) {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("Nome e sobrenome obrigatórios"));
		}
	}

	private boolean temDuasPalavras(String texto) {
		return texto.trim().contains(" ");
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")) {
			this.sexo = sexo;
		} else {
			setSexo(JOptionPane.showInputDialog("Sexo inválido. Masculino ou Feminino"));
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade inválida! Informe valor maior que zero")));
		}
	}

}
