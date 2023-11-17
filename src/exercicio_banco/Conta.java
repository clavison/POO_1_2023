package exercicio_banco;


public class Conta {
	
	protected int numero;
	protected int agencia;
	protected String cliente;
	protected double saldo;
	
	
	
	public Conta() {
		this(0, 0, "", 0);
	}


	public Conta(int numero, int agencia, String cliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	

	@Override
	public String toString() {
		return getNumero()+"-"+getCliente()+"- R$"+getSaldo()+"\n";
	}
	
	
	public boolean deposito(double vl) {
		saldo += vl;
		return true;
	}
	
	public boolean saque(double vl) {
		if(saldo >= vl) {
			saldo -= vl;
			return true;
		}
		return false;
	}
	
	public boolean transferencia(Conta destino, double vl) {
		if(saque(vl)) {
			if(destino.deposito(vl)) {
				return true;
			}else {
				deposito(vl);
				return false;
			}
		}
		return false;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
