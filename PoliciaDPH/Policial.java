class Policial {
    private String nome;
    public float notas[] = new float[10];
    private String patente;

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}
    public void setPatente(String patente) {this.patente = patente;}
    public String getPatente() {return this.patente;}


    
    public Policial(String nome, String patente) {
        this.nome = nome;
        this.patente = patente;
        for(int i = 0; i < notas.length; i ++) {notas[i] = 0;}
    }


    public float Media() {
        float somaNotas = 0;
        for(int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }
        return somaNotas;
    }

    public boolean resultado() {
        boolean aprovado;
        if((Media()) >= 6) {
            aprovado = true;
        } else {
            aprovado = false;
        }
        return aprovado;
    }

    public void mostrarDados() {
        System.out.println("" +  this.nome + "    " +  this.patente + "    "
        + this.Media() + "    " + this.resultado());
    }
}