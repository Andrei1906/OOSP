package org.example;

import java.util.Stack;

public class History {
    private final Stack<ImageState> history = new Stack<>();

    public void saveState(ImageState state) {
        history.push(state);
    }

    public ImageState restoreState() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
