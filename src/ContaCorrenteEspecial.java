class ContaCorrenteEspecial extends ContaBancaria {
    public ContaCorrenteEspecial() {
        super(); // Chama o construtor da classe pai (ContaBancaria)
    }

    @Override
    public void sacar(double quantia) {
        double taxa = quantia * 0.001; // Taxa de 0,1% para clientes especiais
        if (quantia + taxa <= getSaldo()) {
            super.sacar(quantia + taxa); // Chama o método sacar da classe pai
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}





