/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
 //
 /*
 * 
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. == (feito) 
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite. = (feito)
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite. ============== (feito)
 * Realize 1 saque na conta poupanca que exceda o saldo. =========================================(feito)
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("POO Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Yuri - Cliente 1", "1232323");
        Cliente cliente2 = new Cliente("Ana - Cliente 2", "987789");
        
        Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
        conta.saque(560);
        conta.imprimeDados();
        System.out.println();
        
        ContaEspecial contaEsp1 = new ContaEspecial(1000, 2000, "136327", cliente2, ag1); // 1a. conta especial
        
        ContaEspecial contaEsp2 = new ContaEspecial(900, 2000, "154850", cliente1, ag1); // 2a. conta especial
        
        ContaPoupanca contaPoup = new ContaPoupanca("31/10/1998", 1000, "136327", cliente2, ag1); // conta poupanca
        
        contaEsp1.saque(3100);
        contaEsp2.saque(3000);
        contaPoup.saque(900);
        
        contaEsp1.imprimeDados();
        contaEsp2.imprimeDados();
        contaPoup.imprimeDados();
        
        
    }
}
