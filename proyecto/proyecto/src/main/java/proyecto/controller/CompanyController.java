package proyecto.controller;

import org.springframework.web.bind.annotation.*;
import proyecto.model.Company;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class CompanyController {

    private ArrayList<Company> companies;

    public CompanyController() {
        companies = new ArrayList<Company>();
        
        addCompany(1, "Pixel Studio", new ArrayList<>(Arrays.asList("Edición de video con Adobe Premiere", "Postproducción audiovisual")));
        addCompany(2, "CodeLine Web", new ArrayList<>(Arrays.asList("Desarrollo web frontend", "Maquetación con HTML y CSS")));
        addCompany(3, "MotionLab", new ArrayList<>(Arrays.asList("Animación digital con After Effects", "Diseño de gráficos en movimiento")));
        addCompany(4, "Multimedia Creativa", new ArrayList<>());
    }

    private void addCompany(int id, String name, ArrayList<String> offers) {
        companies.add(new Company(id, name, offers));
    }

    @GetMapping("/company")
    public ArrayList<Company> getAll() {
        return companies;
    }

    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable int id) {
        for (int element = 0; element < companies.size(); element++) {
            if (companies.get(element).getId() == id) {
                return companies.get(element);
            }
        }
        return new Company();
    }

    @PostMapping("/company")
    public Company postCompany(@RequestBody Company company) {
        companies.add(company);
        return company;
    }

    @PutMapping("/company")
    public Company putCompany(@RequestBody Company company) {
        for (int element = 0; element < companies.size(); element++) {
            if (companies.get(element).getId() == company.getId()) {
                return companies.set(element, company);
            }
        }
        return new Company();
    }

    @DeleteMapping("/company/{id}")
    public Company deleteCompany(@PathVariable int id) {
        for (int element = 0; element < companies.size(); element++) {
            if (companies.get(element).getId() == id) {
                return companies.remove(element);
            }
        }
        return new Company();
    }

    @PatchMapping("/company")
    public Company patchCompany(@RequestBody Company company) {
        for (int element = 0; element < companies.size(); element++) {

            if (company.getId() == companies.get(element).getId()) {

                if (company.getName() != null) {
                    companies.get(element).setName(company.getName());
                }

                if (company.getOffers() != null) {
                    companies.get(element).setOffers(company.getOffers());
                }

                return companies.get(element);
            }
        }
        return new Company();
    }

    @PatchMapping("/company/{id}/offer/add")
    public Company addOfferToCompany(@PathVariable int id, @RequestBody String newOffer) {
        for (int element = 0; element < companies.size(); element++) {
            if (companies.get(element).getId() == id) {
                companies.get(element).getOffers().add(newOffer);
                return companies.get(element);
            }
        }
        return new Company();
    }

    @PatchMapping("/company/{id}/offer/remove")
    public Company removeOfferFromCompany(@PathVariable int id, @RequestBody String offerToRemove) {
        for (int element = 0; element < companies.size(); element++) {
            if (companies.get(element).getId() == id) {
                companies.get(element).getOffers().remove(offerToRemove);
                return companies.get(element);
            }
        }
        return new Company();
    }
}
