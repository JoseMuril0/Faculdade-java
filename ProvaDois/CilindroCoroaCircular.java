/**
 * CilindroCoroaCircular
 */
public class CilindroCoroaCircular extends CoroaCirculo {
    private float altura;
    
    public CilindroCoroaCircular(float raioMaior, float raioMenor, float altura) {
        super(raioMaior, raioMenor);
        this.altura = altura;
    }

    public void setAltura(float altura) {this.altura = altura;}
    public float getAltura(){return this.altura;}
    
    public float diametro() {return 0;}
    public float perimetroExterno() {return 0;}
    public float perimetroInterno() {return 0;} 

    public float areaLateralExterna() {
        return (float)(super.perimetroExterno() * this.altura);
    }
    public float areaLateralInterna() {
        return (float)(super.perimetroInterno() * this.altura);
    }
    public float areaLateralTotal() {
        return (float)(this.areaLateralExterna() + this.areaLateralInterna());
    }
    public float area() {
        return (float)(2 * super.area() + this.areaLateralTotal());
    }
    public float volume() {
        return (float)(super.area() * this.altura);
    }

    public void mostrarDados() {
        System.out.println("Raio maior e raio menor: " + super.getRaioMaior() + " e " + 
        super.getRaioMenor());
        System.out.println("Altura e Diametro da base: " + this.altura + " e " + 
        super.diametro());
        System.out.println("Area da base: " + super.area());
        System.out.println("Perimetro da base Interno e Externo:  " +
        super.perimetroInterno() + " e " + super.perimetroExterno());
        System.out.println("Area lateral Interna e Externa: " + this.areaLateralInterna() +
        " e " + this.areaLateralExterna());
        System.out.println("Area lateral Total: " + this.areaLateralTotal());
        System.out.println("Volume e area: " + this.volume() + " e " + this.area());
    }
}