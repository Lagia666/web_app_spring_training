package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
    private TodoRepository patrique;


    public TodoListController(TodoRepository herve){
        patrique= herve;
    }
    @PostMapping("/api/todo")
    public void AddTodo(@RequestBody TodoEntity note){
        patrique.save(note);
    }
    @GetMapping("/api/todo")
    public Iterable<TodoEntity> GetTodoList(){
        Iterable<TodoEntity> eric = patrique.findAll();

        return eric;
    }
}
