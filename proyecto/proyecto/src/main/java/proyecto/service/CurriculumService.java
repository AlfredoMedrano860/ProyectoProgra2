package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import proyecto.model.Curriculum;

import java.util.ArrayList;

public class CurriculumService {
    @Autowired
    CurriculumRepository repository;

    public ArrayList<Curriculum> getAll(){
        return repository.getAll();
    }

    public Curriculum add(Curriculum curriculum){
        return repository.add(curriculum);
    }

    public Curriculum remove(Integer id){
        return repository.remove(id);
    }

    public Curriculum search(Integer id){
        return repository.search(id);
    }

    public Curriculum edit(Curriculum curriculum){
        return repository.edit(curriculum);
    }

    public Curriculum update(Curriculum curriculum){ return repository.update(curriculum); }
}
