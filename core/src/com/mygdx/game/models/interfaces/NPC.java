package com.mygdx.game.models.interfaces;

public interface NPC {
    int x = 0;
    int y = 0;

    void perderVida(int dmg);
    void morir();
    void limpiar();


}
