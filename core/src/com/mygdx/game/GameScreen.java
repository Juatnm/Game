package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.mygdx.game.controllers.BaseScreen;

public class GameScreen extends BaseScreen {
 // MUNDO
    private Stage stage;
    private World world;
// Background music
    private Music backgroundMusic;
    private Vector3 position;


    public GameScreen (Launcher game){
        super(game);
        stage = new Stage(new FitViewport(640,360));
        position = new Vector3 (stage.getCamera().position);
        world = new World(new Vector2(0,-10),true);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0.4f, 0.5f, 0.8f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        super.render(delta);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float dt) {

    }


    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }

    @Override
    public void dispose() {
        stage.dispose();
        world.dispose();

    }

    @Override
    public void hide() {
        stage.clear();

    }
}
