package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;

public class TodoList {
    private Todo[] todos;
    public TodoList() {
        this.todos = new Todo[0];
    }
    public Todo[] findAllByUserId(int userId) {
        int foundTodoCount = 0;
        for (Todo todo : todos) {
            if (todo.getUser().getUserId() == userId) foundTodoCount++;
        }
        Todo[] foundTodos = new Todo[foundTodoCount];
        for (int j = 0, i = 0; i < todos.length; i++) {
            if (todos[i].getUser().getUserId() == userId) {
                foundTodos[j] = todos[i];
                j++;
            }
        }
        return foundTodos;
    }
    public int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }
    public void add(Todo todo) {
        Todo[] a = new Todo[todos.length + 1];
        for (Todo aaa : todos) a = todos;
        a[todos.length] = todo;
        todos = a;
    }
}
