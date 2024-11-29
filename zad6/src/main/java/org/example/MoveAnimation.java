package org.example;

public class MoveAnimation extends Animation {
    @Override
    protected void initialize() {
        System.out.println("Инициализация анимации перемещения.");
    }

    @Override
    protected void update() {
        System.out.println("обновление позиции для анимации перемещение.");
    }

    @Override
    protected void render() {
        System.out.println("создание анимации перемещения.");
    }
}