package com.example.TodoApp.Service;

import com.example.TodoApp.Model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    ArrayList<Todo> todos=new ArrayList<>(
            Arrays.asList(new Todo(1,"Wash Clothes","Yet to Complete"),
                    new Todo(2,"Complete Trees Today","In progress")));

    public ArrayList<Todo> GetTodo()
    {
        return todos;
    }

    public void postTask(Todo t) {
        todos.add(t);
    }

    public void Deletetask(Todo t) {
        todos.remove(t);
    }

    public void Changetask(List<Todo> t) {
        for(int i=0;i<t.size();i++)
        {
            if(todos.get(i).getTaskid()==t.get(0).getTaskid())
            {
                todos.set(i,t.get(1));
            }
        }
    }
}
