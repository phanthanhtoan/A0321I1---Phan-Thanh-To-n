package bai4.baitap;

public class bt_xaydunglopfan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public bt_xaydunglopfan() {
    }

    public bt_xaydunglopfan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(this.on){
            return this.speed + " " + this.color + " " + this.radius + " fan is on";
        }
        else {
            return  this.color + " " + this.radius + " fan is off";
        }
    }

    public static void main(String[] args) {
        bt_xaydunglopfan f = new bt_xaydunglopfan(3 , false , 10 , "yellow");
        System.out.println(f);
        bt_xaydunglopfan f2 = new bt_xaydunglopfan(2, true , 5, "blue");
        System.out.println(f2);
    }
}
