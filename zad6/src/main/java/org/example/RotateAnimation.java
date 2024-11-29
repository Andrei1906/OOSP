package org.example;

public class RotateAnimation extends Animation {
    @Override
    protected void initialize() {
        System.out.println("Инициализация анимации поворота.");
    }

    @Override
    protected void update() {
        System.out.println("Обновление угла поворота анимации.");
    }

    @Override
    protected void render() {
        System.out.println("Создание вращающейся анимации.");
    }
}