package com.abhijeet.mytodoapp.controller;

import com.abhijeet.mytodoapp.dto.TodoDto;
import com.abhijeet.mytodoapp.utility.TodoUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/todos")

public class TodoController {

    private static final ArrayList<TodoDto> todoList = new ArrayList<>();


    @GetMapping("")
    public ResponseEntity<ArrayList<TodoDto>> getTodos() {

        TodoUtility.addDummyTodo(todoList);

        return new ResponseEntity<>(todoList, HttpStatus.OK);


    }

}
