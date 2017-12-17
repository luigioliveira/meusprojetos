
public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		// System.out.println(c.getSaldo()); // imprimir saldo anterior.
		double valorAtualizado = c.getSaldo() * selic;
		c.setSaldo(valorAtualizado);
		this.saldoTotal += valorAtualizado;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

}
