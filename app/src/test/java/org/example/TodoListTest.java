package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {
    @Test
    public void testAddAndAll() {
        TodoList list = new TodoList();
        list.add("Task 1");
        list.add("Task 2");
        assertEquals(2, list.all().size());
    }

    @Test
    public void testCompleteAndCompleteList() {
        TodoList list = new TodoList();
        list.add("Task 1");
        list.complete("Task 1");
        assertTrue(list.completedTasks.contains("Task 1"));
    }

    @Test
    public void testClear() {
        TodoList list = new TodoList();
        list.add("Task 1");
        list.clear();
        assertEquals(0, list.all().size());
        assertEquals(0, list.completedTasks.size());
    }
}
