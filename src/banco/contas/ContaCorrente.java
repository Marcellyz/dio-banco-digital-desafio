package banco.contas;

public class ContaCorrente {
    
    private int agencia;
    private int numeroConta;

    public ContaCorrente(int agencia, int numeroConta) {
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
