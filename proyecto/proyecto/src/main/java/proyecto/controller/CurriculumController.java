package proyecto.controller;

import org.springframework.web.bind.annotation.*;
import proyecto.model.Company;
import proyecto.model.Curriculum;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/curriculum")
public class CurriculumController {
    private ArrayList<Curriculum> curriculums;

    public CurriculumController() {
        curriculums = new ArrayList<Curriculum>();

    }


    @GetMapping
    public ArrayList<Curriculum> getAll() {
        return curriculums;
    }

    @GetMapping("{id}")
    public Curriculum getCurriculumById(@PathVariable int id) {
        for (int element = 0; element < curriculums.size(); element++) {
            if (curriculums.get(element).getId() == id) {
                return curriculums.get(element);
            }
        }
        return new Curriculum();
    }

    @PostMapping
    public Curriculum postCurriculum(@RequestBody Curriculum curriculum) {
        curriculums.add(curriculum);
        return curriculum;
    }

    @PutMapping
    public Curriculum putCurriculum(@RequestBody Curriculum curriculum) {
        for (int element = 0; element < curriculums.size(); element++) {
            if (curriculums.get(element).getId() == curriculum.getId()) {
                return curriculums.set(element, curriculum);
            }
        }
        return new Curriculum();
    }

    @DeleteMapping("{id}")
    public Curriculum deleteCurriculum(@PathVariable int id) {
        for (int element = 0; element < curriculums.size(); element++) {
            if (curriculums.get(element).getId() == id) {
                return curriculums.remove(element);
            }
        }
        return new Curriculum();
    }




}
