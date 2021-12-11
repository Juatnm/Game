package com.mygdx.game.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class Utils {
    /*
   Constantes para revolver
     */
    public final static int CARGADOR_PISTOLA = 6;
    public final static Sound SDISPARO = Gdx.audio.newSound(Gdx.files.internal("com/mygdx/game/assets/9mshot.wav"));
    public final static Sound SRECARGA = Gdx.audio.newSound(Gdx.files.internal("com/mygdx/game/assets/revolverReload.wav"));
    public final static Sound SSINBALAS = Gdx.audio.newSound(Gdx.files.internal("com/mygdx/game/assets/noAmmo.wav"));

}

