public class ContaPoupanca  extends Conta{

    public ContaPoupanca() {
        super();
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
