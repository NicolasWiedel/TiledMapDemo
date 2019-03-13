package com.tiledmapdemoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * created by Nicolas Wiedel on 13.03.2019
 */
public class Player extends Sprite {

    private Vector2 velocity = new Vector2(0, 0);

    private float speed = 60f * 2f;
    private float gravity = 60f * 1.8F;

    public Player(Sprite sprite){
        super(sprite);
    }

    @Override
    public void draw(Batch batch) {
        update(Gdx.graphics.getDeltaTime());
        super.draw(batch);
    }

    private void update( float delta){
        velocity.y -= gravity * delta;

        if(velocity.y > speed){
            velocity.y = speed;
        }
        else if (velocity.y < -speed){
            velocity.y = -speed;
        }

        setX(getX() + velocity.x * delta);
        setY(getY() + velocity.y * delta);
    }
}
