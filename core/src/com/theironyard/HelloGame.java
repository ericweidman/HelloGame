package com.theironyard;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x, y;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		if (Gdx.input.isKeyPressed(Input.Keys.W)){
			y += 1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.S)){
			y -= 1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.D)){
			x += 1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.A)){
			x -= 1;
		}


		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
}
