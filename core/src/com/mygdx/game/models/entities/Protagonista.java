package com.mygdx.game.models.entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.mygdx.game.models.interfaces.NPC;

public class Protagonista implements NPC {

    private int vida;
    private Body cuerpo;
    private BodyDef cuerpoDef;
    private Fixture fixture;
    private FixtureDef fixtureDef;
    private PolygonShape forma;

    public Protagonista(int vida, Body cuerpo, BodyDef cuerpoDef, Fixture fixture, FixtureDef fixtureDef, PolygonShape forma) {
        this.vida = vida;
        this.cuerpo = cuerpo;
        this.cuerpoDef = cuerpoDef;
        this.fixture = fixture;
        this.fixtureDef = fixtureDef;
        this.forma = forma;
    }

    @Override
    public void perderVida(int dmg) {

    }

    @Override
    public void morir() {

    }

    @Override
    public void limpiar() {

    }
}
