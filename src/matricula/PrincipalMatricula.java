package matricula;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalMatricula {
	
	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				professores.add(new Professor());
				break;
			case 2:
				Disciplina d = new Disciplina();
				d.cadastrar(professores);
				disciplinas.add(d);
				break;
			case 3:
				Aluno a = new Aluno();
				a.cadastra();
				alunos.add(a);
				break;

			
			}
		}while(op != 10);
	}
	
	public static int menu() {
		String menu = "1 - Cadastrar Professores\n"
				+ "2 - Cadastrar Disciplinas\n"
				+ "3 - Cadastrar Alunos\n"
				+ "10 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	public static void matricula() {
		Aluno a = Util.selecionaAluno(alunos);
	}

}
