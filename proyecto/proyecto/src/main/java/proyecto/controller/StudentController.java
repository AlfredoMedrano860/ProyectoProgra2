package proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.model.Curriculum;
import proyecto.model.Student;
import proyecto.service.StudentService;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    private ArrayList<Student>students = null;

    public StudentController(){

    }

    @GetMapping
    public ArrayList<Student> getAll() {
        return students;
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.search(id);
    }

    @PostMapping
    public Student postStudent(@RequestBody Student student) {
       return service.p
    }

    @PutMapping
    public Student putStudent(@RequestBody Student student) {
        for (int element = 0; element < students.size(); element++) {
            if (students.get(element).getId() == student.getId()) {
                return students.set(element, student);
            }
        }
        return new Student();
    }

    @DeleteMapping("{id}")
    public Student deleteStudent(@PathVariable int id) {
        for (int element = 0; element < students.size(); element++) {
            if (students.get(element).getId() == id) {
                return students.remove(element);
            }
        }
        return new Student();
    }

}
