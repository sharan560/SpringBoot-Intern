package com.example.TodoApp.Controller;


import com.example.TodoApp.Model.Todo;
import com.example.TodoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todo;

    @GetMapping("/")
    public ArrayList<Todo> getTodo()
    {
        return todo.GetTodo();
    }

    @PostMapping("/")
    public void Posttask(@RequestBody Todo t)
    {
        todo.postTask(t);
    }

    @DeleteMapping("/")
    public void DeleteTask(@RequestBody Todo t)
    {
        todo.Deletetask(t);
    }

    @PutMapping("/")
    public void ChangeTask(@RequestBody List<Todo> t){
        todo.Changetask(t);
    }

}
