class LerRetangulo {
    public static void main(String[] args) throws Exception {
      float base, altura;
      Retangulo ex1 = new Retangulo(2,2);
      ex1.mostraDados();
  
      System.out.print("Base: ");
      base = JUtil.readFloat();
      ex1.setBase(base);
      while(ex1.getBase() != 0) {
        System.out.print("Altura: ");
        altura = JUtil.readFloat();
        ex1.setAltura(altura);
        ex1.mostraDados();
        System.out.print("Base: ");
        base = JUtil.readFloat();
        ex1.setBase(base);
      }
    }
  }