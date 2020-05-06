package pacmaninterface;

public class PacMan extends Personagem {

    private int pontuacao = 0;
    private int vidas;

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public PacMan() {
        this.setCor("Amarelo");
        this.setPosicaoX(50);
        this.setPosicaoY(50);
        this.setVidas(3);
    }

    public void perdeVida() {
        this.setVidas(this.getVidas()-1);
    }

    public void ganhaPonto() {
        this.setPontuacao(this.getPontuacao()+1);
    }

}
