package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import proyecto.model.Student;

import java.util.ArrayList;

public class StudentService {
    @Autowired
    StudentRepository repository;

    public ArrayList<Student> getAll(){
        return repository.getAll();
    }

    public Student add(Student student){
        return repository.add(student);
    }

    public Student remove(Integer id){
        return repository.remove(id);
    }

    public Student search(Integer id){
        return repository.search(id);
    }

    public Student edit(Student student){
        return repository.edit(student);
    }

    public Student update(Student student){ return repository.update(student); }
}
