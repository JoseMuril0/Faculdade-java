class Cilindro extends Circulo {
    private float altura;

    public Cilindro() {
        super();
        this.altura = 0.0f;
    }
    public Cilindro(float raio, float altura) {
        super(raio);
        this.altura = altura;
    }
    
    public float areaLateral() {
        return (super.perimetro() * this.altura);
    }
    public float area() {
        return (float)(2 * super.area() * this.areaLateral());
    }
    public float volume() {
        return (super.area() * this.altura);
    }

    public void mostrarDados() {
        System.out.println("Raio: " + super.getRaio() + "\nAltura: " +
        this.altura + "\nArea: " + super.area() + "\nPerimetro: " +
        super.perimetro() + "\nDiametro: " + super.diametro() + 
        "Area = " + this.area() + "| Area Lateral = " + this.areaLateral() +
        "| Volume = " + this.volume());
    }
}