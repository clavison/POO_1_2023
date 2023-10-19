package exercicio_banco;

import java.util.ArrayList;

public class Banco {
	
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta(1, 1, "CORRENTE", 0));
		contas.add(new ContaEspecial(2, 2, "ESPECIAL", 0, 1000));
		contas.add(new ContaUniversitaria(3, 3, "UNIVERSITÁRIA", 0));
		
		Caixa.depositar(contas.get(0), 1000);
//		System.out.println(contas.get(0));
//		
//		Caixa.sacar(contas.get(0), 1500);
//		System.out.println(contas.get(0));
//		
		Caixa.sacar(contas.get(0), 300);
//		System.out.println(contas.get(0));
		
		Caixa.depositar(contas.get(1), 1000);
		//System.out.println(contas.get(1));
		
		Caixa.sacar(contas.get(1), 1500);
		//System.out.println(contas.get(1));
		
		Caixa.transferir(contas.get(1), contas.get(0), 100);
		//System.out.println(contas.get(0));
		//System.out.println(contas.get(1));
//		
		Caixa.depositar(contas.get(2), 300);
		//System.out.println(contas.get(2));
		Caixa.depositar(contas.get(2), 3000);
		//System.out.println(contas.get(2));
		Caixa.depositar(contas.get(0), 10000);
		System.out.println("Antes");
		System.out.println(contas.get(0));
		System.out.println(contas.get(2));
		
		Caixa.transferir(contas.get(0), contas.get(2), 3000);
		System.out.println("Depois");
		System.out.println(contas.get(0));
		System.out.println(contas.get(2));
		
		Caixa.transferir(contas.get(0), contas.get(2), 1000);
		System.out.println("Depois2");
		System.out.println(contas.get(0));
		System.out.println(contas.get(2));
		
		
	}

}
