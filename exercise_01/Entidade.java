class Entidade {
    //atributos
    private int id;


    // Relacionamento (Agregacao): Uma entidade contem uma posicao
    private Posicao posicao;

    //metodos
    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public Posicao getPosicao(){
        return posicao;
    }

    public void setPosicao(Posicao p) {
        this.posicao = p;
    }

}
