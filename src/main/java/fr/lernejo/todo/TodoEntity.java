package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;

@Table("todo")
public class TodoEntity {
    @Id
    Long id;
    String message;
    String author;

}
