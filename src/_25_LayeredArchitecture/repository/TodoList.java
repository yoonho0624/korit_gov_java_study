package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;

public class TodoList {
    private Todo[] todos;
    public TodoList() {
        this.todos = new Todo[0];
    }
    public Todo[] getAllTodo() {
        return todos;
    }
    public int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }
    public void add(Todo todo) {
        Todo[] a = new Todo[todos.length + 1];
        for (Todo aaa : todos) {
            a = todos;
        }
        a[todos.length] = new Todo(generateTodoId(), todo.getContents(), todo.getUser(), todo.getCreateDt());
        todos = a;
    }
}
