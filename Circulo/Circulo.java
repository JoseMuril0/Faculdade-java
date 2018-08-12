abstract class Circulo {
    private float raio;

    public float getRaio() {return this.raio;}
    public Circulo() {
        this.raio = 0.0f;
    }
    public Circulo(float raio) {
        this.raio = raio;
    }

    public float diametro() {
        return (this.raio * 2);
    }
    public float area() {
        return (float)(Math.PI * Math.pow(raio, 2));
    }

    public float perimetro() {
        return (float)(2 * Math.PI * raio);
    }

    public void mostrarDados() {
        System.out.println("Raio: " + this.raio + "\n" +
        "Area: " + area() + "\n" +
        "Perimetro: " + perimetro() + "\n" +
        "Diametro: " + diametro());
    }
}