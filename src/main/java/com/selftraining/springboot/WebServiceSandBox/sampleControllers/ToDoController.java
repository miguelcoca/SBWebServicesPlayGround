package com.selftraining.springboot.WebServiceSandBox.sampleControllers;

import com.selftraining.springboot.WebServiceSandBox.JavaObjects.ToDo;
import com.selftraining.springboot.WebServiceSandBox.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
