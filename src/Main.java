
public class Main {
    public static void main(String[] args) {


        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.Deposit(1000);
        cc.Transaction(100, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();

    }
}