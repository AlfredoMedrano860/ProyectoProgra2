package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.model.Student;
import proyecto.repository.StudentRepository;

import java.util.ArrayList;
@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    public ArrayList<Student> getAll(){
        return repository.getAll();
    }

    public Student add(Student student){
        return repository.add(student);
    }

    public Student delete(Integer id){
        return repository.delete(id);
    }

    public Student search(Integer id){
        return repository.search(id);
    }

    public Student patch(Student student){
        return repository.patch(student);
    }

    public Student update(Student student){ return repository.update(student); }
}
