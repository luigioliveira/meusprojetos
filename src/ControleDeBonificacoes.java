
public class ControleDeBonificacoes {
	private double totalDeBonficacoes = 0;
	
	public void registra (Funcionario funcionario) {
		totalDeBonficacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return totalDeBonficacoes;
	}
	
	
}
