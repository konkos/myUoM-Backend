package gr.uom.myUoM.professors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }


    public List<Professor> getProfessorsByInput(String input) {
        return professorRepository.getProfessorsByInput(input.trim());
    }

    public Professor addProfessor(ProfessorDTO professorDTO) {
        String fname = professorDTO.getFname();
        String lname = professorDTO.getLname();
        String building = professorDTO.getBuilding();
        String email = professorDTO.getEmail();
        String department = professorDTO.getDepartment();
        String office = professorDTO.getOffice();
        String tel = professorDTO.getTel();
        String imgUrl = professorDTO.getImgUrl();
        String title = professorDTO.getTitle();

        Professor professor = new Professor(imgUrl, fname, lname, department, title, tel, email, building, office);
        return professorRepository.save(professor);
    }
}
