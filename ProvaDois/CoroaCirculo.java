abstract class CoroaCirculo {
    private float raioMaior;
    private float raioMenor;

    public CoroaCirculo(float raioMaior, float raioMenor) {
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor; 
    }

    public void setRaioMaior(float raioMaior) {this.raioMaior = raioMaior;}
    public float getRaioMaior() {return this.raioMaior;}
    public void setRaioMenor(float raioMenor) {this.raioMenor = raioMenor;}
    public float getRaioMenor() {return this.raioMenor;}

    public float diametro() {
        return (2 * (this.raioMaior - this.raioMenor));
    }
    public float area() {
        return (float)(Math.PI * (Math.pow(this.raioMaior, 2) - Math.pow(this.raioMenor, 2)));        
    }

    public float perimetroExterno() {
        return (float)(2 * Math.PI * this.raioMaior);
    }
    public float perimetroInterno() {
        return (float)(2 * Math.PI * this.raioMenor);
    } 
    public void mostrarDados() {
        System.out.println("Raio maior: " + this.raioMaior + " Raio menor: " + this.raioMenor);
        System.out.println("Diametro: " + this.diametro() + " Area: " + this.area());
        System.out.println("Pedrimetro Externo: " + this.perimetroExterno());
        System.out.println("Pedrimetro Interno" + this.perimetroInterno());
    }
}