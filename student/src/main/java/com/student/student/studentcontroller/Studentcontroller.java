package com.student.student.studentcontroller;

import com.student.student.Studentmodel.Student;
import com.student.student.studentservice.Examservice;
import com.student.student.studentservice.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Studentcontroller {

    private final Studentservice studentService;
//      Studentservice studentservice = new Studentservice();
    private final Examservice examservice;

    @Autowired
    public Studentcontroller(Studentservice studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hi")
    public String hello() {
        return "rajesh kumar";
    }

    @PostMapping("/save")
    public Student addData(@RequestBody Student student) {
        return studentService.savedata(student); // corrected method call
    }

    @GetMapping("/student/detail")
    public Student getStudentDetailsById(@RequestParam("id") String id) {
        return studentService.getStudentById(id);
    }

}
