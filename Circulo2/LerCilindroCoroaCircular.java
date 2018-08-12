class LerCilindroCoroaCircular {
    public static void main(String[] args) throws Exception {

        float maiorR, menorR, altura;

        System.out.print("Maior raio: ");
        maiorR = JUtil.readFloat();
        while(maiorR != 0) {
            System.out.print("Menor Raio: ");
            menorR = JUtil.readFloat();
            System.out.print("Menor Altura: ");
            altura = JUtil.readFloat();        
            CilindroCoroaCirculo p1  = new CilindroCoroaCirculo(maiorR, menorR, altura);

            p1.mostrarDados();
            System.out.println("\n================BREAK================\n");
            System.out.print("Maior raio: ");
            maiorR = JUtil.readFloat();
        }
    }
}