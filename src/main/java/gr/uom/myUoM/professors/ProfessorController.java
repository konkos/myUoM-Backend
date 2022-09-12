package gr.uom.myUoM.professors;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/all/{page}")
    public List<Professor> getAllProfessors(int page) {
        return professorService.getAllProfessors(page);
    }

    @GetMapping
    public List<Professor> getProfessorsByInput(@RequestParam String input) {
        return professorService.getProfessorsByInput(input);
    }

    @PostMapping
    public Professor addProfessor(ProfessorDTO professorDTO) {
        return professorService.addProfessor(professorDTO);
    }

    @PostMapping("/list")
    public List<Professor> addManyProfessors(@RequestBody List<ProfessorDTO> professors) {
        return professorService.addManyProfessors(professors);
    }
}
