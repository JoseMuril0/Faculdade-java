class Circulo {
    float raio;
    
    public Circulo(float raio) {
        this.raio = raio;
    }

    public float diametro(){
      return this.raio * 2;
    }
  
    public float area(){
      return (float)(Math.PI * Math.pow(this.raio,2));    
    }
  }
  