package com.student.student.studentservice;

import com.student.student.Studentmodel.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Examservice {
    private Repository repository;


    @GetMapping("id")
    private Integer getMarks(String id) {
        return repository.getMarks(id);
    }


//    @GetMapping("result/id")
//    public Student getresult(String id){
//        return getResult(id);
//    }
}

