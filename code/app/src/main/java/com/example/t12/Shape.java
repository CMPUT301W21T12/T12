package com.example.t12;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape(int x, int y, String color)
    {
        this.x=x;
        this.y=y;
        this.color = "blue";
    }
}
