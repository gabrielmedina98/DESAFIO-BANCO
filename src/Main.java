public class Main {
    public static void main(String[] args) {
        Cliente Gabriel = new Cliente();
        Gabriel.setNome("Gabriel");


        Conta cc = new ContaCorrente(Gabriel);
        cc.depositar(100);

        Conta poupança = new ContaPoupança(Gabriel);

        cc.transferir(100,poupança);

        cc.imprimiExtrato();
        poupança.imprimiExtrato();
    }

}
