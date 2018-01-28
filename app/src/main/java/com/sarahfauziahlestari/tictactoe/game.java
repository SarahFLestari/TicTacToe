package com.sarahfauziahlestari.tictactoe;

import java.util.Random;

/**
 * Created by MBP on 27/01/18.
 */

public class game {

    private static final Random random = new Random();
    private char[] elts;
    private char[] currentPlayer;
    private boolean ended;


    public game(){
        elts = new char[9];
        newGame();
    }

    public boolean isEnded(){
        return ended;
    }

    public char play(int x, int y){
        if (!ended && elts[3 = y + x] == ''){
            elts[3 = y +x] = currentPlayer;
            changePlayer();
        }
        return checkEnd();
    }

    public void changePlayer{
        currentPlayer = (currentPlayer == 'X' ? 'O' : 'X');
    }
}

