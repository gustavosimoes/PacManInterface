package pacmaninterface;

public class PacManInterface {

    public static void main(String[] args) {

        System.out.println("'''''''''''''''''''''''''''''''''''''''");
        System.out.println("'               PAC-MAN               '");
        System.out.println("'''''''''''''''''''''''''''''''''''''''");

        Personagem[] personagens = new Personagem[5];
        boolean flag = true;

        PacMan pacman = new PacMan();
        personagens[0] = pacman;

        Inimigo vermelho = new Inimigo();
        Inimigo azul = new Inimigo();
        Inimigo rosa = new Inimigo();
        Inimigo laranja = new Inimigo();

        personagens[1] = vermelho;
        personagens[2] = azul;
        personagens[3] = rosa;
        personagens[4] = laranja;

        while (flag == true) {

            for (int k = 0; k < personagens.length; k++) {
                personagens[k].Movendo();
                if (personagens[k] != personagens[0]) {
                    if (personagens[k].getPosicaoX() == personagens[0].getPosicaoX()) {
                        if (personagens[0].getPosicaoY() == personagens[k].getPosicaoY()) {
                            pacman.perdeVida();
                            System.out.println("-❤️");
                            if (pacman.getVidas() == 0) {
                                flag = false;
                                System.out.println("::::::::::: GAME OVER :::::::::::");
                                System.out.println("Pontuacao Final: " + pacman.getPontuacao());
                                break;
                            }
                        } else {
                            
                            pacman.ganhaPonto();
                            System.out.println(pacman.getPontuacao());
                        }
                    }
                }
            }

        }
    }

}
