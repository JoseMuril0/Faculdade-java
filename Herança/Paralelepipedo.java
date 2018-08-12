class Paralelepipedo extends Retangulo
// Paralelepipedo é filho de Retangulo
{private float altura;

public Paralelepipedo () // Sobrecarga de construtor
{super (0,0);
this.altura =0;}

public Paralelepipedo (float comprimento, float largura, float altura)
{super (comprimento,largura);
this.altura = altura;}

public float getAltura()
{return (this.altura);}

public void setAltura (float altura)
	{this.altura = altura;}

float area () {
    return (super.getComprimento() * super.getLargura() +
            super.getComprimento() * this.altura +
            super.getLargura() * this.altura());
}
}