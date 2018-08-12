class LerEsferaCilindro {
    public static String LerTipo() throws Exception {
        String tipo;
        do {
            System.out.println("\nInforme 'E' para Esfera, 'C'"+
            " para Cilindro ou 'F' para Fim-> ");
            tipo = JUtil.readString();
        } while(!tipo.equals("E") && !tipo.equals("C") && !tipo.equals("F"));
        return tipo;
    }
    public static void main(String[] args) throws Exception {
      Circulo c1;
      String le;
      float raio, altura;
      do {
          le = LerTipo();
          if (le.equals("E")) {
              System.out.println("Informe o raio: ");
              raio = JUtil.readFloat();
              c1 = new Esferar(raio);
          } else 
			 if (le.equals("C")) {
            System.out.println("Informe o raio: ");
            raio = JUtil.readFloat();
            System.out.println("Informe o altura: ");
            altura = JUtil.readFloat();
            
            c1 = new Cilindro(raio, altura);
			}
			else
			{c1 = new Cilindro(0, 0);}
		 c1.mostrarDados();

      } while (!le.equals("F"));
    }
}