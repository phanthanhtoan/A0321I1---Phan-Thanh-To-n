package bai6.baitap.PointvaMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed(){
        float [] test = new float[2];
        test[0] = this.xSpeed;
        test[1] = this.ySpeed;
        return test;
    }

    @Override
    public String toString() {
        return   "("+ super.toString() + " , xSpeed = " + getxSpeed() + " , ySpeed = " + getySpeed() + ")";
    }

    public MovablePoint move(){
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }
}
