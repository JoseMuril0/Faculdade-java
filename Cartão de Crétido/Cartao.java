abstract class Cartao {
    private int numero;
    private String titular;
    private float limite;
    private float saldo;

    public Cartao(int numero, String titular, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.saldo = 0;
    }

    public void setNumero(int numero) {this.numero = numero;}
    public int getNumero() {return this.numero;}
    public void setTitular(String titular) {this.titular = titular;}
    public String getTitular() {return this.titular;}
    public void setLimite(float limite) {this.limite = limite;}
    public float getLimite(){return this.limite;}
    public float getSaldo() {return this.saldo;}
    
    public boolean altorizar(float valor) {
        return (valor + this.saldo <= this.limite);
    }

    public void comprar(float valor) {
        if (altorizar(valor)) {
            this.saldo += valor;
            System.out.println("Compra realizada: " + valor + "R$");
        } else {
            System.out.println("ERRO - Compra nao altoriza");
        }
    }

    public void pagar(float valor) {
        this.saldo -= valor;
        System.out.println("Pago com sucesso no valor de "
        + valor + " R$ Saldo atual: " + this.saldo);
    }

    public void mostrarDados() {
        System.out.println("[Numero: " + this.numero +
                           "/Titular: " + this.titular +
                           "/Limite: " + this.limite +
                           "/Saldo: " + this.saldo + "]");
    }
}