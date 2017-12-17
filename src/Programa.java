
public class Programa {
	public static void main(String[] args) {
		/*
		ControleDeBonificacoes cdb = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(2000);
		
		Gerente funcionario2 = new Gerente();
		funcionario2.setSalario(2000);
		
		cdb.registra(funcionario1);
		cdb.registra(funcionario2);
		
		System.out.println(cdb.getTotalDeBonificacoes());
		
		
		AtualizadorDeContas adc = new AtualizadorDeContas(2);
		
		Conta c = new Conta();
				
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		cc.atualiza(2);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		//adc.roda(c);
		
		System.out.println("Valor total: " + adc.getSaldoTotal());
		*/
		
		Secretaria s = new SecretariaAdministrativa();
		s.getBonificacao();
		
	}

}
