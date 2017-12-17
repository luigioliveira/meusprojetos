
public class Conta {
	protected double saldo;
		
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void atualiza(double taxa) {
		this.saldo += saldo * taxa;
	}

}
