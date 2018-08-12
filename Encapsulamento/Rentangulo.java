class Retangulo {
    private float base, altura;
    
    public Retangulo(float base, float altura) {
      this.base = base;
      this.altura = altura;
    }
  
    public void setBase(float base) {
      this.base = base;
    }
    public float getBase() {
      return this.base;
    }
    public void setAltura(float altura){
      this.altura = altura;
    }
    public float getAltura() {
      return this.altura;
    }
  
    public float area() {
      return this.base * this.altura;
    }
    public float perimetro() {
      return 2 * (this.base*this.altura);
    }
  
    public void mostraDados() {
      System.out.println("=========== MOSTRA DADOS ==============");
      System.out.println("Area: " + area());
      System.out.println("Perimetro: " + perimetro());
      System.out.println("=========== MOSTRA DADOS ==============");
    }
  }
  