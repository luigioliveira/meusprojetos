
public class ContaCorrente extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2) ;
	}
	
	public void saca(double valor) {
		this.saldo -= valor - 0.10;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	

}
