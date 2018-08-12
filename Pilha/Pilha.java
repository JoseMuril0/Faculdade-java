class Pilha 
{	private int [] pilha;	 //Atributos encapsulados
	private int max;
	private int indice;	

	public Pilha (int max)		// Construtor
	{
        pilha = new int [max];
        this.max = max - 1; // Base zero
        this.indice = -1;
    }

	public Pilha () {
        int max = 10; // Default 10 elementos
        pilha = new int [max];
        this.max = max - 1; // Base zero
        this.indice = -1;
	}

	public boolean pilhaVazia ()
	{return (this.indice == -1);}

	public boolean pilhaCheia ()
	{return (this.indice == this.max);}

	public int getIndice ()	// Acesso ao atributo indice
	{return (this.indice);}

	public int getMax ()	// Acesso ao total de elementos empilhados
	{return (this.max + 1);}

	public boolean push (int numero)	// Empilha um elemento
	{ boolean ok = true;
		if (! this.pilhaCheia ())
	{ this.pilha [++this.indice] = numero;	}
	else
	{ok = false;
		System.out.println ("Overflow (Pilha cheia) !");}
	return (ok);
	}

	public int top ()	// Retorna o  elemento do topo
	{ int numero = -1;
		if (! this.pilhaVazia () )
	{ numero = this.pilha [this.indice];
	}
	else
	{	System.out.println ("Pilha vazia !");}
	return (numero);
	}

	public int pop ()	// Desempilha um elemento
	{ int numero;
		numero = this.top ();
	if (numero != - 1 )
	{ this.indice--;}
	else
	{	System.out.println ("Underflow !");}
	return (numero);
	}
	public void limparPilha() {
		this.indice = -1;
	}
}