class CartaoEspecial extends Cartao {
    private float valorMCompra;

    public void setValorMCompra(float valorMCompra) {this.valorMCompra = valorMCompra;}
    public float getValorMCompra() {return this.valorMCompra;}

    public CartaoEspecial (int numero, String titular, float saldo, float valorMCompra) {
        super(numero, titular, saldo);
        this.valorMCompra = valorMCompra;
    }

    public void comprar(float valor) {
        if (valor >= this.valorMCompra) {
            super.comprar(valor);
        } else {
            System.out.println("Erro = Valor minimo para compra: " + valorMCompra +
            " R$");
        }
    }

    public void pagarTuto() {
        super.pagar(super.getSaldo());
    }

    public void mostrarDados() {
        System.out.println("------------------MOSTRARDAODS----------------");
        super.mostrarDados();
        System.out.println("Valor minino de compra: " + this.valorMCompra);
        System.out.println("------------------MOSTRARDAODS----------------");
    }
}