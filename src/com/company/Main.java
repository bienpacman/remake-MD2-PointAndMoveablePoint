package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = new Point();
        System.out.println(point);
        point = new Point(2.3f,4.6f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2.3f,3.6f,5.1f,1.1f);
        System.out.println(movablePoint);
    }
}
