abstract class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private float custo;

    public Produto(int codigo, String nome, int quantidade, float custo){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
    }
    
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public int getCodigo() { return this.codigo;}
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome;}
    public int getQuantidade() { return this.quantidade; }
    public void setCusto(float custo) { this.custo = custo; }
    public float getCusto() { return this.custo;}

    public float getValorEstoque() {
        return (this.quantidade * this.custo);
    }

    public void repor(int quantidade, float custo) {
        this.quantidade += quantidade;
    }

    public boolean validarSalddo(int quantidade) {
        return (this.quantidade >= quantidade);
    }

    public void baixar(int quantidade) {
        if(validarSalddo(quantidade)){
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade solicitada nao permitivel");
        }
    }

    public void mostraDados() {
        System.out.println("------------------ MOSTRAR DADOS ------------------");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Custo(Unitario): " + this.custo);
        System.out.println("Valor do estoque: " + this.getValorEstoque());
        System.out.println("------------------ MOSTRAR DADOS ------------------");
    }
}