package com.selftraining.springboot.WebServiceSandBox.Services;

import com.selftraining.springboot.WebServiceSandBox.JavaObjects.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ToDoService {

    private static List<ToDo> ToDos = new ArrayList<>();
    private static int ToDoCount = 4;

static{
        ToDos.add(new ToDo(1,"Miguel", "Learn Spring DI",new Date(),false));
        ToDos.add(new ToDo(2,"Angel", "Learn Hibernate",new Date(),false));
        ToDos.add(new ToDo(3,"Miguel", "Learn JPA",new Date(),false));
        ToDos.add(new ToDo(4,"Angel", "Learn Spring MVC",new Date(),false));
}

    public List<ToDo> getToDosForUser(String userName) {
        List<ToDo> matchingToDos =  new ArrayList<>();

        for(ToDo toDo:ToDos){
            if(toDo.getUserName().equals(userName)){
                matchingToDos.add(toDo);
            }
        }

        return matchingToDos;
    }

    public ToDo getToDoForUserWithID(String userName, int ID){
        for(ToDo toDo: ToDos){
            if(toDo.getUserName().equals(userName) && toDo.getID()==ID){
                return toDo;
            }
        }

        return null;
    }

    public ToDo addToDo(String userName, String description, Date toDoDate, boolean isDone){
        ToDo newToDo = new ToDo(++this.ToDoCount, userName, description, toDoDate, isDone);

        ToDos.add(newToDo);

        return newToDo;
    }

    public ToDo getToDoByID(int ID){

        for(ToDo toDo: ToDos){
            if(toDo.getID() == ID){
                return toDo;
            }
        }

        return null;
    }
}
