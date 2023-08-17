package a_classes_objetos;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	double peso;
	double altura;
	char sexo;

	void cadastra() {
		nome = JOptionPane.showInputDialog("Informe o nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		sexo = JOptionPane.showInputDialog("Sexo(M/F)").toUpperCase().charAt(0);
	}

	double calculaImc() {
		return peso/(altura * altura);
	}
	
	String avaliacao() {
		String avaliacao = "";
		double imc = calculaImc();
		if (sexo == 'M') {
			if (imc < 20.7) {
				avaliacao = "Abaixo do peso";
			} else if (imc >= 20.7 && imc < 26.4) {
				avaliacao = "Peso ideal";
			} else if (imc >= 26.5 && imc < 27.8) {
				avaliacao = "Pouco acima do peso";
			} else if (imc >= 27.9 && imc < 31.1) {
				avaliacao = "Acima do peso";
			} else {
				avaliacao = "Obesidade";
			}
		} else if (sexo == 'F') {
			if (imc < 19.1) {
				avaliacao = "Abaixo do peso";
			} else if (imc >= 19.1 && imc < 25.8) {
				avaliacao = "Peso ideal";
			} else if (imc >= 25.9 && imc < 27.3) {
				avaliacao = "Pouco acima do peso";
			} else if (imc >= 27.4 && imc < 32.3) {
				avaliacao = "Acima do peso";
			} else {
				avaliacao = "Obesidade";
			}
		}
		
		return avaliacao;
	}
	
	String exibirDados() {
		return nome + " - " + calculaImc() + " - " + avaliacao()+"\n";
	}
	

}
