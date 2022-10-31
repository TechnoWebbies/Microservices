package com.shanira.rentacar.controller;

import com.shanira.rentacar.model.Student;
import com.shanira.rentacar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello SpringBoot from GET";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello SpringBoot from POST";
    }

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
}
