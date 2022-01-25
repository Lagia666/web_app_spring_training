package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
    ArrayList<Todo> michel = new ArrayList<Todo>();

    @PostMapping("/api/todo")
    public void AddTodo(@RequestBody Todo note){
        michel.add(note);
    }
    @GetMapping("/api/todo")
    public ArrayList<Todo> GetTodoList(){
        return michel;
    }
}
