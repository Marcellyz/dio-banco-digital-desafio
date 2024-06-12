package banco.contas;

import banco.IConta;

public abstract class Conta implements IConta{

    private  static final int AGENCIA_PADRAO = 1;
    private  static int SEQUENCIAL = 1;

    protected   int agencia;
    protected   int numeroConta;
    protected   double saldo;
    protected   Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (saldo != 0d) {
            saldo -= valor;
        }else{
            System.out.println("Voce não possui saldo!");
        }
    }

    public void depositar(double valor) { saldo += valor; }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void extratodaConta() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numeroConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
