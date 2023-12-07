public class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;


    private static final int DEFAULT_AGENCY = 1;
    private static int  accountNumber = 1;


    public Conta() {
        agencia = Conta.DEFAULT_AGENCY;
        numero =  accountNumber ++;

    }

    public void Deposit(double amount){

        this.saldo += amount;

    }


    public void CashOut(double amount){
        this.saldo -= amount;
    }

    public void Transaction(double amount, Conta toAccount){

    this.saldo -= amount;
    toAccount.Deposit(amount);


    }
    protected void imprimirInfosComuns() {

        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
