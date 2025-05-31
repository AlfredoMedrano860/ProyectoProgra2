package proyecto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internship")
public class IntershipController {

}
    /*

    @Autowired
    InternshipService service;

    private ArrayList<Internship> internships;

    public InternshipController() {
        //internships = new ArrayList<>();
    }

    @GetMapping
    public ArrayList<Internship> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Internship postInternship(@RequestBody Internship internship) {
        return service.add(internship);
    }

    @GetMapping("/{id}")
    public Internship getInternshipById(@PathVariable int id) {
        return service.post(id);
    }

    @PutMapping
    public Internship putInternship(@RequestBody Internship internship) {
        return service.put(internship);
    }

    @DeleteMapping("/{id}")
    public Internship deleteInternship(@PathVariable int id) {
        return service.delete(id);
    }

    @PatchMapping
    public Internship patchInternship(@RequestBody Internship internship) {
        return service.patch(internship);
    }

     */

