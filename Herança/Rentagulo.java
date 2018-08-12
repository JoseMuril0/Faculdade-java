class  Retangulo
{protected float comprimento;  //é nosso
// protegido : as subclasses podem acessar direto
private float largura; // encapsulamento máximo ou rígido

public Retangulo (float comprimento, float largura)
{this.comprimento = comprimento;
this.largura = largura;}

public float getComprimento ()
{return (this.comprimento);}

public void setComprimento (float comprimento)
	{this.comprimento = comprimento;}

public float getLargura()
{return (this.largura);}

public void setLargura (float largura)
	{this.largura = largura;}

float area ()
{return (this.comprimento * this.largura);}

float perimetro ()
{return 2 * (this.comprimento  +  this.largura);}

void mostrarDados ()
{System.out.println ("comprimento "+ this.comprimento +
"\nlargura " + this.largura + 
"\nArea " + this.area () + 	
"\nPerimetro " + this.perimetro ());}
}