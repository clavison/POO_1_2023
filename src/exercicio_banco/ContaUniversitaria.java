package exercicio_banco;

public class ContaUniversitaria extends Conta{
	
	
	
	public ContaUniversitaria() {
		super();
	}

	public ContaUniversitaria(int numero, int agencia, String cliente, double saldo) {
		super(numero, agencia, cliente, saldo);
	}

	@Override
	public boolean deposito(double vl) {
		if(saldo + vl < 2000) {
			return super.deposito(vl);
		}
		return false;
	}

}
