/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*

 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta ==========(feito)
 * 
 * 2) Adicione o atributo limite do tipo double e o encapsule =============(feito)
 * 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. ======================(feito)
 *  
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) ================(feito)
 *  
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.  
 *    Faca tambem com que este metodo acumule o CPMF devido. ========================(feito)
 */
public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(double limite, double saldoInicial, String num, Cliente tit, Agencia ag) {
		super(saldoInicial, num, tit, ag);
		setLimite(limite);
	}

	public ContaEspecial(double limite, String num, Cliente tit, Agencia ag) {
		super(num, tit, ag);
		setLimite(limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override 
	public void imprimeDados () {
        System.out.println("======================================" + "\n");
		System.out.println("====== Dados da Conta ======");
		super.imprimeDados();
		System.out.println("====== Conta Especial ======");
		System.out.println("Valor Limite: " + getLimite());
        System.out.println("======================================" + "\n");

	}

	@Override
	public void saque(double valor) { // Mudar metodo acumulador e atributo saldo para protected
		double saldo = getSaldo();

		System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());
		if (valor > 0) {
			if (saldo + limite >= valor) {
				saldo -= valor;
				acumularCPMF(valor);
			} 
			else 
				System.out.println("Saldo com Limite insuficiente");
		}
		else 
			System.out.println("O valor de saque deve ser positivo");				
	}

}


