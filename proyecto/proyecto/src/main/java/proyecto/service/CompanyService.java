package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import proyecto.model.Company;

import java.util.ArrayList;

public class CompanyService {
    @Autowired
    CompanyRepository repository;

    public ArrayList<Company> getAll(){
        return repository.getAll();
    }

    public Company add(Company company){
        return repository.add(intership);
    }

    public Company remove(Integer id){
        return repository.remove(id);
    }

    public Company search(Integer id){
        return repository.search(id);
    }

    public Company edit(Company company){
        return repository.edit(company);
    }

    public Company update(Company company){ return repository.update(company); }
}
