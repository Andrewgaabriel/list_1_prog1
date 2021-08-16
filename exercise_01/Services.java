class Services {


    public static int contaPossiveisCandidatos (Inimigo[] i) {
        int c = 0;
        for (int k = 0; k < i.length; k++) {
            Posicao posicao = i[k].getPosicao();
            Forca velocidade = i[k].getVelocidade();
            if ((posicao.getX() > 100 || posicao.getY()> 100) && i[k].getEnergia() <= 50 && velocidade.tamanho() == 200) {
                c++;
            }
        }
        return c;
    }
    
}
