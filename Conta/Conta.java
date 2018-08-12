abstract class Conta 
{
    private String nome;
    private String numero;
    private float saldo;

    public String getNumero() {return this.numero;}
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}
    public float getSaldo() {return this.saldo;}

    public Conta(String nome, String numero) 
    {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }

    public Conta(String nome, String numero, float saldo) 
    {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void setNumero(String numero) 
    {
        this.numero = numero;
    }

    public void creditar(float valor) 
    {
        this.saldo += valor;
    }
    
    public void debitar(float valor) 
    {
        this.saldo -= valor;
    }

    public void transferirPara(Conta contaD,float valor) 
    {
        this.debitar(valor);
        contaD.creditar(valor);
    }

    public void mostrarDados() 
    {
        System.out.println("Numero: "+ this.numero + ",Nome: " 
        + this.nome + ", Saldo" + this.saldo);
    }
    
 }