package pacmaninterface;

import java.util.Random;

public abstract class Personagem implements Movel {

    protected String cor;
    protected int posicaoX;
    protected int posicaoY;
    
    protected int[][] posicao = new int[100][100];
    
    Random sort = new Random();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    @Override
    public void movePraCima() {
        if (this.getPosicaoY() != 0) {
            this.setPosicaoY(this.getPosicaoY() - 1);
        }
    }

    @Override
    public void movePraBaixo() {
        if (this.getPosicaoY() != 99) {
            this.setPosicaoY(this.getPosicaoY() + 1);
        }
    }

    @Override
    public void movePraDireita() {
        if (this.getPosicaoX() != 99) {
            this.setPosicaoX(this.getPosicaoX() + 1);
        }

    }

    @Override
    public void movePraEsquerda() {
        if (this.getPosicaoX() != 0) {
            this.setPosicaoX(this.getPosicaoX() - 1);
        }

    }

    public void Movendo() {
        int opcao = sort.nextInt(3) + 1;

        switch (opcao) {
            case 1:
                this.movePraBaixo();
                break;
            case 2:
                this.movePraCima();
                break;
            case 3:
                this.movePraDireita();
                break;
            case 4:
                this.movePraEsquerda();
                break;
        }
    }

}
