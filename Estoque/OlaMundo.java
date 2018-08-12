class OlaMundo {
    public static void main(String[] args) {
        ProdutoCustoAnual p1 = new ProdutoCustoAnual(1, "Feijao", 60, 1.5f);
        ProdutoCustoMedio p2 = new ProdutoCustoMedio(2, "Tomate", 120, 2.5f);

        p1.mostraDados();
        p2.mostraDados();

        p1.repor(1.60f, 100);
        p2.repor(100, 2.60f);

        
        p1.mostraDados();
        p2.mostraDados();

        p1.baixar(30);        
        p2.baixar(50);
        
        p1.mostraDados();
        p2.mostraDados();

        p2.baixar(300);

        p1.mostraDados();
        p2.mostraDados();
    }
}