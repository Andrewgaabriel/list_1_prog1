class Boid extends Entidade {
    //atributos
    private int energia;


    //relacionamento de agregação, o boid tem uma velocidade/força
    private Forca velocidade;

    //metodos
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int e){
        energia = e;
    }

    public Forca getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Forca f) {
        this.velocidade.setA(f.getA);
        this.velocidade.setB(f.getB);
    }
}
