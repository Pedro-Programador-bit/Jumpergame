package org.peter.jumpergame;

import java.util.ArrayList;

/**
 * Esta classe serve como pai das peças, tendo os principais atributos.
 * Ela usa a enum Movement para declarar movimentos possíveis.
 * @see Movement
 */

public class Peca {
    private boolean isEnemy;
    /**
     * Lista dos movimentos disponíveis (da enum {@link Movement}).
     */
    public ArrayList<Movement> movesAva = new ArrayList<Movement>();
    /**
     * Representação da peça no tabuleiro.
     */
    private char symbol;
    /**
     * Posição Y no tabuleiro.
     */
    private byte y;
    /**
     * Posição X no tabuleiro.
     */
    private byte x;
    /**
     * Construtor.
     */
    Peca(boolean pIsEnemy, byte pX, byte pY, char pSymbol, Movement[] pMovesAva) {
        isEnemy = pIsEnemy;
        x = pX;
        y = pY;
        symbol = pSymbol;
        for (byte ind=0; ind<pMovesAva.length; ind++) {
            movesAva.add(pMovesAva[ind]);
        }
    }
}
