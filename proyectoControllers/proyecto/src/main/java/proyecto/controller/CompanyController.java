package proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.model.Company;
import java.util.ArrayList;


@RestController
@RequestMapping("/company")
public class CompanyController {

}
/*
    @Autowired
    CompanyService service;

    private ArrayList<Company> companies;

    public CompanyController() {
        //companies = new ArrayList<>();
    }

    @GetMapping
    public ArrayList<Company> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Company postCompany(@RequestBody Company company) {
        return service.add(company);
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Integer id) {
        return service.post(id);
    }

    @PutMapping
    public Company putCompany(@RequestBody Company company) {
        return service.put(company);
    }

    @DeleteMapping("/{id}")
    public Company deleteCompany(@PathVariable Integer id) {
        return service.delete(id);
    }

    @PatchMapping
    public Company patchCompany(@RequestBody Company company) {
        return service.patch(company);
    }
}

 */
