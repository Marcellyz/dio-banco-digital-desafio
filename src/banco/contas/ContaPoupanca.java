package banco.contas;

public class ContaPoupanca {
    
    private int agencia;
    private int numeroConta;

    public ContaPoupanca(int agencia, int numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    
}
