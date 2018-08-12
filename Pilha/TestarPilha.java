class TestarPilha 
{
	public static void main(String[] args) throws Exception
	{Pilha pilha = new Pilha (5);
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Pilha vazia ? " + pilha.pilhaVazia ());
	System.out.println ("Empilha  valor 50 " + pilha.push (50));
	System.out.println ("Empilha  valor 25 " + pilha.push (25));
	System.out.println ("Empilha  valor 32 " + pilha.push (32));
	System.out.println ("Topo " + pilha.top ());
	System.out.println ("Empilha  valor 70 " + pilha.push (70));
	System.out.println ("Empilha  valor 5 " + pilha.push (5));
	System.out.println ("Empilha  valor 90 " + pilha.push (90));
	System.out.println ("Indice " + pilha.getIndice ());
	System.out.println ("Numero de elementos " + pilha.getMax ());
	System.out.println ("Pilha cheia ? " + pilha.pilhaCheia ());
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Desempilha " + pilha.pop ());
	System.out.println ("Pilha vazia ? " + pilha.pilhaVazia ());
	JUtil.pause ();
	}
}