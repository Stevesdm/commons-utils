package com.steve.api;

import com.steve.model.Person;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ApiController {

    @RequestMapping("/person")
    public String save(@RequestBody @Valid Person person, BindingResult result){
        if (result.hasFieldErrors()){
            FieldError error = result.getFieldError();
            System.out.println(error);
            return error.getDefaultMessage();
        }

        return "ok";

    }

}
