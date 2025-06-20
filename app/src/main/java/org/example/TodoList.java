package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<String> allTasks = new ArrayList<>();
    public final List<String> completedTasks = new ArrayList<>();

    public void add(String task) {
        allTasks.add(task);
    }

    public void complete(String task) {
        if (allTasks.contains(task)) {
            completedTasks.add(task);
        }
    }

    public List<String> all() {
        return new ArrayList<>(allTasks);
    }

    public List<String> complete() {
        return new ArrayList<>(completedTasks);
    }

    public List<String> incomplete() {
        List<String> incomplete = new ArrayList<>(allTasks);
        incomplete.removeAll(completedTasks);
        return incomplete;
    }

    public void clear() {
        allTasks.clear();
        completedTasks.clear();
    }
}
