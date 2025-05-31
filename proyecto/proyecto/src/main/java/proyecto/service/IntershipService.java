package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class IntershipService {
    @Autowired
    IntershipRepository repository;

    public ArrayList<Intership> getAll(){
        return repository.getAll();
    }

    public Intership add(Intership intership){
        return repository.add(intership);
    }

    public Intership remove(Integer id){
        return repository.remove(id);
    }

    public Intership search(Integer id){
        return repository.search(id);
    }

    public Intership edit(Intership intership){
        return repository.edit(intership);
    }

    public Intership update(Intership intership){ return repository.update(intership); }
}
