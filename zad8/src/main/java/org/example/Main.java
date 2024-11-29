package org.example;

public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        History history = new History();

        editor.setState("Оригинал");
        history.saveState(editor.save());

        editor.setState("Отредактировано - Яркость скорректирована");
        history.saveState(editor.save());

        editor.setState("Отредактированный - Обрезанный");

        editor.restore(history.restoreState());
        editor.restore(history.restoreState());
    }
}