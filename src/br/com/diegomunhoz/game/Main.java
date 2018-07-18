package br.com.diegomunhoz.game;

import br.com.diegomunhoz.core.Game;

public class Main {

    public static void main(String[] args) {
        // A execução do programa Java começa aqui, no método estático main.
        // Tudo o que fazemos aqui é crair um objeto do tipo JogoCirculo e 
        // colocar ele para rodar.
        Game myGame = new JogoCirculo();
        myGame.run();
        // Quando o jogo terminar de rodar, chegaremos aqui e o programa termina.
    }
}
