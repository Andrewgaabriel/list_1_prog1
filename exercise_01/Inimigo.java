class Inimigo extends Boid {
    //atributos
    private int vida;

    

    //metodos
    public int getVida(){
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Inimigo achaAlvoMaisProximo(Inimigo i[]){
        
        for(int c = 0; c < i.length; c++){
            if(i[c].getPosicao().getX() == this.getPosicao().getX() && i[c].getPosicao().getY() == this.getPosicao().getY() && i[c].getVelocidade().getA()== this.getVelocidade().getB() ){
                return i[c];
            }
           
           
        }
        System.out.println("Nao ha alvos proximos!\n");
        return null;
    }
}
