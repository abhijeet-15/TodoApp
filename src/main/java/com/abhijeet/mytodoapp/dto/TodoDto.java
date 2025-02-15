package com.abhijeet.mytodoapp.dto;


public class TodoDto {

    private int id;

    private String todoTitle;

    private boolean isCompleted;


    public TodoDto(int id, String todoTitle, boolean isCompleted) {
        this.id = id;
        this.todoTitle = todoTitle;
        this.isCompleted = isCompleted;
    }


    public int getId() {
        return id;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
