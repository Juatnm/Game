package com.mygdx.game.models.entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.mygdx.game.models.clases.Arco;
import com.mygdx.game.models.interfaces.NPC;

public class BandidoArco implements NPC {

    private Body cuerpo;
    private BodyDef cuerpoDef;
    private Fixture fixture;
    private FixtureDef fixtureDef;
    private int vida = 100;
    private Arco arco;

    public BandidoArco(Body cuerpo, BodyDef cuerpoDef, Fixture fixture, FixtureDef fixtureDef, Arco arco) {
        this.cuerpo = cuerpo;
        this.cuerpoDef = cuerpoDef;
        this.fixture = fixture;
        this.fixtureDef = fixtureDef;
        this.arco = arco;
    }

    @Override
    public void perderVida(int dmg) {
// sonido ser golpeado
        this.vida = this.vida - dmg;

        if (this.vida <= 0){
            this.morir();
        }

    }

    @Override
    public void morir() {
        // sonido al morir
    }

    @Override
    public void limpiar() {

    }
}
