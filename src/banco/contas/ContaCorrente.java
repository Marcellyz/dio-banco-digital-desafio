package banco.contas;

public class ContaCorrente extends Conta{

    public void imprimirConta(){
        System.out.println("=== EXTRATO DA CONTA CORRENTE ===");
        super.extratoConta();
    }
}
