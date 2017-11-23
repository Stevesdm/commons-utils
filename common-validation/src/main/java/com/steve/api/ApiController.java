package com.steve.api;

import com.steve.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ApiController {

    private static Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping("/person")
    public String save(@RequestBody @Valid Person person, BindingResult result){
        if (result.hasFieldErrors()){
            FieldError error = result.getFieldError();
            System.out.println(error);
            return error.getDefaultMessage();
        }

        return "ok";
    }

    @RequestMapping("/demo")
    public String demo(@RequestBody Person person){
        logger.info(person+"");
        return "ok";
    }

    @RequestMapping("/demo2")
    public String demo2(
            @RequestParam(name = "a",defaultValue = "aa",required = true) String a
    ){
        logger.info(a);
        return a;
    }



}
