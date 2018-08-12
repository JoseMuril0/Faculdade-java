class MovimentoCartao 
{
    public static void main(String[] args) throws Exception 
    {
        CartaoEspecial c1 = new CartaoEspecial(1, "Joao", 500, 50);

        c1.mostrarDados();
        c1.comprar(50);
        c1.comprar(49);
        c1.comprar(450);
        c1.comprar(50);
        c1.mostrarDados();
        c1.pagar(50);
        c1.mostrarDados();
        c1.comprar(50);
        c1.pagarTuto();
        c1.mostrarDados();
    }
}