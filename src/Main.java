import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente marcelly = new Cliente();
        marcelly.setNome("Marcelly");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
