class CilindroCoroaCirculo extends CoroaCircula{
    private float altura;

    public CilindroCoroaCirculo(float MaioRaio, float MenoRaio, float altura) {
        super(MaioRaio, MenoRaio);
        this.altura = altura;
    }

    public void setAltura(float altura) {this.altura = altura;}
    public float getAltura() {return this.altura;}

    public float areaLateralExterna() {
        return (float)(super.perimetroExterno() * this.altura);
    }

    public float areaLateralInterna() {
        return (float)(super.perimetroInterno() * this.altura);
    }

    public float areaLateralTotal() {
        return (areaLateralExterna() + areaLateralInterna());
    }

    public float area() {
        return (float)(2 * super.area() + this.areaLateralTotal());
    }

    public float volume () {
        return (float)(super.area() * this.altura);
    }

    public void mostrarDados() {
        System.out.println("<o> Maior Raio: " + super.getMaioRaio() + " <|> "+
        "Menor raio: " + super.getMenoRaio() + " <|> "+
        "Altura: " + this.altura + " <|>" +
        "Diamentro da base: " + super.diametro() + " <|> " +
        "Area da base: " + super.area()  + " <|>\n" +
        "PerimetroExterno: "+ super.perimetroExterno() + " <|> " +
        "PerimetroInterno: "+ super.perimetroInterno() + " <|> " +
        "Area lateral Externa:  " + this.areaLateralExterna() + " <|>\n" +
        "Area lateral Interna: " + this.areaLateralInterna() + " <|> " +
        "Area lateral total: " + this.areaLateralTotal() + " <|> " +
        "Area: " + this.area() + " <|> " +
        "Volume: " + this.volume() + " <o> ");
    }
    
}