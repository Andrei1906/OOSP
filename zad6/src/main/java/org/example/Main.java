package org.example;

public class Main {
    public static void main(String[] args) {
        Animation moveAnimation = new MoveAnimation();
        Animation rotateAnimation = new RotateAnimation();

        moveAnimation.animate();
        rotateAnimation.animate();
    }
}