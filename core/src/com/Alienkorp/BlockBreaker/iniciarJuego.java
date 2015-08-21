package com.Alienkorp.BlockBreaker;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class iniciarJuego extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int WINDOW_WIDTH = 1024;
	 int WINDOW_HEIGHT = 768;
	 Camera camera;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
	    if (Gdx.app.getType() == ApplicationType.Desktop) {
	        int ANDROID_WIDTH = Gdx.graphics.getWidth();
	        int ANDROID_HEIGHT = Gdx.graphics.getHeight();
	        camera = new OrthographicCamera(ANDROID_WIDTH, ANDROID_HEIGHT);
	     
	        camera.update();
	    } else {
	        camera = new OrthographicCamera(WINDOW_WIDTH, WINDOW_HEIGHT);
	      
	        camera.update();
	    }

	
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
