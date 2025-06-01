package proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/curriculum")
public class CurriculumController {


}
/*
    @Autowired
    CurriculumService service;

    private ArrayList<Curriculum> curriculums;

    public CurriculumController() {
        curriculums = new ArrayList<>();
    }

    @GetMapping
    public ArrayList<Curriculum> getAll() {
        return  service.getAll();
    }

    @PostMapping
    public Curriculum postCurriculum(@RequestBody Curriculum curriculum) {
        return service.add(curriculum);
    }

    @GetMapping("/{id}")
    public Curriculum getCurriculumById(@PathVariable Integer id) {
        return service.post(id);
    }

    @PutMapping
    public Curriculum putCurriculum(@RequestBody Curriculum curriculum) {
        return service.put(curriculum);
    }

    @DeleteMapping("/{id}")
    public Curriculum deleteCurriculum(@PathVariable Integer id) {
        return service.delete(id);
    }

    @PatchMapping
    public Curriculum patchCurriculum(@RequestBody Curriculum curriculum) {
        return service.patch(curriculum);
    }

 */


