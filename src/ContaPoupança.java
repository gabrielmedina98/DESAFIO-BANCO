public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimiExtrato() {
        System.out.println("==Extrato Conta Poupança== ");
        super.imprimirAtributos();
    }

}
