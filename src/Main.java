public class Main {
    public static void main(String[] args) {
        // Teste com ContaBancaria
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(1000);
        conta1.sacar(500);
        System.out.println("Saldo da Conta Bancária: " + conta1.getSaldo());

        // Teste com ContaCorrenteEspecial
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial();
        conta2.depositar(1000);
        conta2.sacar(500);
        System.out.println("Saldo da Conta Corrente Especial: " + conta2.getSaldo());
    }
}