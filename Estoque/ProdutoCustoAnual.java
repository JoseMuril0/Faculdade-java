class ProdutoCustoAnual  extends Produto
{

    public ProdutoCustoAnual(int codigo, String nome, int quantidade, float custo)
    {
        super(codigo, nome, quantidade, custo);
    }
    
    public void repor(float custo, int quantidade) 
    {
        super.setCusto(custo);
        super.repor(quantidade, custo);
    }
}