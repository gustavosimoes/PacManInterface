package pacmaninterface;

public class Inimigo extends Personagem {
    
    private static int posiciona = 0;

    public Inimigo() {
        if(posiciona==0){
            this.setPosicaoX(0);
            this.setPosicaoY(0);
            this.setCor("Vermelho");
        }
        if(posiciona==1){
            this.setPosicaoX(0);
            this.setPosicaoY(99);
            this.setCor("Azul");
        }
        if(posiciona==2){
            this.setPosicaoX(99);
            this.setPosicaoY(0);
            this.setCor("Rosa");
        }
        if(posiciona==3){
            this.setPosicaoX(99);
            this.setPosicaoY(99);
            this.setCor("Laranja");
        }
        posiciona++;
    }
    
    
    
    
}
