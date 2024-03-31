package com.student.student.studentrepository;
import com.student.student.Studentmodel.Student;

import java.util.HashMap;


@org.springframework.stereotype.Repository
public class Repository {
    private final HashMap<String, Student> studentDB = new HashMap<>();
    private final HashMap<String, Student> studentResult = new HashMap<>();
//    private Student exmamService;

    public void saveData(Student student, Integer data) {
        // Assuming you're using the student's ID as the key in the HashMap
        studentDB.put(student.getId(), student);
        System.out.println("Data saved in repository.");
    }

    public Student getResult(String id) {
        // Retrieve student from the HashMap based on ID
        return studentResult.get(id);
    }
    public void updatestudentResultById(String id, Student marks ){
        studentResult.put(id,marks);
    }
    public Student getMarks(String id){
        return studentResult.get(id);

    }
    public Student getStudentById(String id){
        return studentDB.get(id);
    }
    public Student updateStudentById(String id,Student student){
        if(!studentDB.containsKey(id)){
            return null;
        }
        studentDB.put(id,student);
        System.out.println(studentDB);
        return studentDB.get(id);
    }

}
