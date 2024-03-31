package com.student.student.studentservice;

import com.student.student.Studentmodel.Student;
import com.student.student.studentrepository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Service
public class Studentservice {

    private Repository repository;

    @Autowired
    public Studentservice(Repository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public Student savedata(@RequestBody Student student) {
        System.out.println("Calling repository method to save data...");
        Integer data = 123;
        repository.saveData(student,data); // Corrected method call
        System.out.println("Data saved successfully!");
        return student;
    }

    @GetMapping("/id")
    public Student getStudentById(@RequestParam String id) {
        return repository.getData(id); // Assuming getData returns Student based on ID
    }
}
