package com.selftraining.springboot.WebServiceSandBox.sampleControllers;

import com.selftraining.springboot.WebServiceSandBox.JavaObjects.Person;
import org.springframework.web.bind.annotation.*;

import static com.selftraining.springboot.WebServiceSandBox.WebServicesSandBoxApplication.person;

@RequestMapping(value = "/users")
@RestController
public class SCReturnObject {

    @GetMapping("/{id}/Data")
    public Person personMessage(@PathVariable(value = "id") String id){

//        return new Person(id,
//                    "Miguel Angel",
//                    "Coca Saavedra",
//                     "Marie Courie S/N");

        person.setID(id);
        return person;
    }

}
