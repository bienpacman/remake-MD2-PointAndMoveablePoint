package com.company;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){

    }
    public MovablePoint(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public MovablePoint(float x, float y, float xSpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setySpeed(float ySpeed, float xSpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed,x,y};

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void setSpeed(float x, float y, float xSpeed, float ySpeed ){
       super.setX(x);
       super.setY(y);
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
    }

}
