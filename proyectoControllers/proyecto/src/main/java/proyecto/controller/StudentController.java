package proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {

}
/*
    @Autowired
    //StudentService service;

    private ArrayList<Student> students;

    public StudentController() {
        //students = new ArrayList<>();
    }

    @GetMapping
    public ArrayList<Student> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Student postStudent(@RequestBody Student student) {
        return service.add(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.get(id);
    }

    @PutMapping
    public Student putStudent(@RequestBody Student student) {
        return service.put(student);
    }

    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable int id) {
        return service.delete(id);
    }

    @PatchMapping
    public Student patchStudent(@RequestBody Student student) {
        return service.patch(student);
    }
}

 */
