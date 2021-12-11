package com.mygdx.game.models.clases;

import com.badlogic.gdx.audio.Sound;
import com.mygdx.game.controllers.Utils;
import com.mygdx.game.models.interfaces.Weapon;

public class Revolver implements Weapon {

    private int balasCargador;
    private int balasTotal;
    private final Sound SONIDO_DISPARO;
    private final Sound SONIDO_RECARGA;
    private final Sound SONIDO_SINBALAS;

    public Revolver(int balasCargador) {

        this.balasCargador = Utils.CARGADOR_PISTOLA;
        this.SONIDO_DISPARO = Utils.SDISPARO;
        this.SONIDO_RECARGA = Utils.SRECARGA;
        this.SONIDO_SINBALAS = Utils.SSINBALAS;
    }

    @Override
    public void disparar() {

    if( balasCargador >0){
        balasCargador = balasCargador - 1;
        this.SONIDO_DISPARO.play();
    }
    else {
        this.recargar();
    }
            }

    @Override
    public void recargar() {
// Lanzamos sonido de recarga
        this.SONIDO_RECARGA.play();
// Ajustamos las balas
        if (balasTotal >=6){
            balasCargador = 6;
            balasTotal = balasTotal - 6;
        }else if(balasTotal< 6){
            balasCargador = balasTotal;
            balasTotal = 0;
        }
        else if (balasTotal <= 0 && balasCargador <= 0 ){
            this.SONIDO_SINBALAS.play();
        }

    }

    @Override
    public void desaparecer() {


    }
}
