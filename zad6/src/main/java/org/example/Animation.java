package org.example;

public abstract class Animation {
    public final void animate() {
        initialize();
        update();
        render();
    }

    protected abstract void initialize();

    protected abstract void update();

    protected abstract void render();
}