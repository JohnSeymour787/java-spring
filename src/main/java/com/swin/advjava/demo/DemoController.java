package com.swin.advjava.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController
{
    @Autowired
    StudentsRepository studentsRepository;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        try
        {
            List<Student> students = studentsRepository.findAll();

            return new ResponseEntity<>(students, HttpStatus.OK);
        }
        catch (Exception e) {e.printStackTrace();}
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}