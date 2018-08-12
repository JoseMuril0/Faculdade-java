class Esferar extends Circulo {
    public Esferar() {
        super();
    }
    public Esferar(float raio) {
        super(raio);
    }

    public float area() {
        return (float)(4 * super.area());
    }
    public float volume() {
        return (float)((4/3) * Math.PI * Math.pow(super.getRaio(), 2));
    }

    public void mostrarDados() {
        System.out.println("Raio: " + super.getRaio() + "\n" +
        "Area: " + area() + "\n" +
        "Perimetro: " + volume());
    }
}
