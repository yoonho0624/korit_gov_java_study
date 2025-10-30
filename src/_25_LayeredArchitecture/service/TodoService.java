package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.TodoList;
import _25_LayeredArchitecture.repository.UserList;

public class TodoService {
    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }
    public void printAllTodoList() {
        System.out.println("[[ Todo 조회 ]]");
        for (Todo todo : todoList.getAllTodo()) System.out.println(todo);
    }
    public void todoUp(TodoRegisterReqDto todoRegisterReqDto) {
        Todo todo = todoRegisterReqDto.register();
        todo.setTodoId(todoList.generateTodoId());
        todoList.add(todo);

    }
}
