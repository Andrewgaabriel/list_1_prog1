class Main {
    public static void main(String args[]) { 

        Inimigo inimigo, inimigo1, inimigo2;
        

        Inimigo [] inimigos = new Inimigo[3];

        inimigo = new Inimigo();
        Posicao pos0 = new Posicao();
        pos0.setX(126);
        pos0.setY(125);
        inimigo.setPosicao(pos0);
        Forca vel0 = new Forca();
        vel0.setA(25);
        vel0.setB(35);
        inimigo.setVelocidade(vel0);
        inimigo.setEnergia(231);

        inimigo1 = new Inimigo();
        Posicao pos1 = new Posicao();
        pos1.setX(100);
        pos1.setY(200);
        inimigo1.setPosicao(pos1);
        Forca vel1 = new Forca();
        vel1.setA(20);
        vel1.setB(30);
        inimigo1.setVelocidade(vel1);
        inimigo1.setEnergia(150);

        inimigo2 = new Inimigo();
        Posicao pos2 = new Posicao();
        pos2.setX(55);
        pos2.setY(89);
        inimigo2.setPosicao(pos2);
        Forca vel2 = new Forca();
        vel2.setA(21);
        vel2.setB(22);
        inimigo2.setVelocidade(vel2);
        inimigo2.setEnergia(125);

        inimigos[0] = inimigo;
        inimigos[1] = inimigo1;
        inimigos[2] = inimigo2;
    
       
       System.out.println("\npossiveis candidatos = "+ Services.contaPossiveisCandidatos(inimigos));
       System.out.println("\ninimigo proximo = "+inimigos[0].achaAlvoMaisProximo(inimigos));
 
 
 
     }  
    
}
