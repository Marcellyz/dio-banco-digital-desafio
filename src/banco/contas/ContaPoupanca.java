package banco.contas;

public class ContaPoupanca extends Conta{

	public void imprimirConta(){
		System.out.println("=== EXTRATO DA CONTA POUPANCA ===");
		super.extratoConta();
	}
    
}
