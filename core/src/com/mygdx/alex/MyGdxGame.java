package com.mygdx.alex;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	float posX,posY;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		posX=posY=0.0f;
	}

	@Override
	public void render () {
		posX +=10.0f;
		posY +=2.0f;
		ScreenUtils.clear(1, 3, 0, 1);
		batch.begin();
		batch.draw(img, posX, posY);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
