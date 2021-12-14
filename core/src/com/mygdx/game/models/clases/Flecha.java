package com.mygdx.game.models.clases;


import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.ArrowShapeBuilder;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.utils.Disposable;

public class Flecha  implements Disposable {

    private BodyDef cuerpo;
    private Fixture fixture;
    private int dmg;
    private CircleShape shape;

    public Flecha(BodyDef cuerpo, Fixture fixture, int dmg, CircleShape shape) {
        this.cuerpo = cuerpo;
        this.fixture = fixture;
        this.dmg = dmg;
        this.shape = shape;
    }


    @Override
    public void dispose() {

    }
}
