package com.abhijeet.mytodoapp.controller;

import com.abhijeet.mytodoapp.dto.TodoDto;
import com.abhijeet.mytodoapp.entity.Todo;
import com.abhijeet.mytodoapp.repository.TodoRepository;
import com.abhijeet.mytodoapp.utility.TodoUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/todos")

public class TodoController {


    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("")
    public ResponseEntity<ArrayList<TodoDto>> getTodos() {


        List<Todo> todos = todoRepository.findAll();
        ArrayList<TodoDto> todoDtos = (ArrayList<TodoDto>) todos.stream()
                .map(todo -> new TodoDto(todo.getId(), todo.getTodoTitle(), todo.isCompleted()))
                .collect(Collectors.toList());

        return new ResponseEntity<>(todoDtos, HttpStatus.OK);


    }

    @PostMapping("")
    public ResponseEntity<TodoDto> createTodo(@RequestBody Todo requestTodo) {

        // Save the request object into the database
        Todo savedTodo = todoRepository.save(requestTodo);

        // Convert Todo to TodoDto
        TodoDto responseDto = new TodoDto(savedTodo.getId(),
                savedTodo.getTodoTitle(),
                savedTodo.isCompleted());

        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }


}
