package bai7.baitap.Colorable;

import bai7.baitap.Colorable.Colorable;

public class Shape {
    private String color = "Black";
    private boolean filled = false;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color is " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }

    public static void printShape(bai7.baitap.Colorable.Shape[] shapes) {
        for (bai7.baitap.Colorable.Shape a : shapes) {
            System.out.println(a.toString());
        }
    }

    public static boolean isColorable(bai7.baitap.Colorable.Shape shape) {
        return Colorable.class.isInstance(shape);
    }

    public void resize(double v) {
    }
}
