package com.qst.feiji;

public class Bullet extends FlyingObject {

	public Bullet (int x,int y) {
		this.x = x;
		this.y = y;
        this.image = ShootGame.bullet;
	}

	@Override
	public boolean outOfBounds() {
        int speed = 0;
        // TODO Auto-generated method stub
        y-=speed;
        return false;
    }

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

}
