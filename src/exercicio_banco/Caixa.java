package exercicio_banco;

public class Caixa {
	
	public static boolean depositar(Conta c, double vl) {
		return c.deposito(vl);
	}
	public static boolean sacar(Conta c, double vl) {
		return c.saque(vl);
	}
	public static boolean transferir(Conta origem, Conta destino, double vl) {
		return origem.transferencia(destino, vl);
	}

}
