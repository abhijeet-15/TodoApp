package com.abhijeet.mytodoapp.utility;

import com.abhijeet.mytodoapp.dto.TodoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;

@Data
public class TodoUtility {

    public static ArrayList<TodoDto> addDummyTodo(ArrayList<TodoDto> todoList) {

        if(!todoList.isEmpty()) return todoList;

        TodoDto todo1 = new TodoDto(1,"Create a todo list", false);
        TodoDto todo2 = new TodoDto(2,"Create a todo array list", false);
        TodoDto todo3 = new TodoDto(3,"create docker for this app", false);


        todoList.add(todo1);
        todoList.add(todo2);
        todoList.add(todo3);

        return todoList;

    }

}
