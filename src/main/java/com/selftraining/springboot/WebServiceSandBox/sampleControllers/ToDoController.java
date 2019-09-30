package com.selftraining.springboot.WebServiceSandBox.sampleControllers;

import com.selftraining.springboot.WebServiceSandBox.JavaObjects.ToDo;
import com.selftraining.springboot.WebServiceSandBox.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(value = "/users/{name}/todos", method = RequestMethod.GET)
    public List<ToDo> getToDosForUser(@PathVariable(value = "name") String name){
        List<ToDo> userToDos = toDoService.getToDosForUser(name);

        return userToDos;
    }

    @RequestMapping(value = "/users/{name}/todos/{id}", method = RequestMethod.GET)
    public ToDo getTodoforUserByID(@PathVariable(value = "name") String name, @PathVariable(value = "id") int ID){
        return toDoService.getToDoForUserWithID(name, ID);
    }

    @RequestMapping(value = "/users/{name}/todos", method = RequestMethod.POST)
    public ResponseEntity<?> addToDoForUser(@PathVariable(value = "name") String name, @RequestBody ToDo toDo){

        ToDo newToDo = toDoService.addToDo(name, toDo.getDescription(), toDo.getTargetDate(), toDo.isIsdone());

        if(newToDo == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newToDo.getID()).toUri();

        return ResponseEntity.created(location).build();
    }
}
