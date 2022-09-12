package gr.uom.myUoM.professors;

import gr.uom.myUoM.department.Department;
import gr.uom.myUoM.department.DepartmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProfessorService {

    private final ProfessorRepository professorRepository;
    private final DepartmentService departmentService;

    private final int pageSize = 20;

    public ProfessorService(ProfessorRepository professorRepository, DepartmentService departmentService) {
        this.professorRepository = professorRepository;
        this.departmentService = departmentService;
    }

    public List<Professor> getAllProfessors(int pageNum) {
        PageRequest page = PageRequest.of(pageNum, pageSize);
        Page<Professor> professorPage = professorRepository.findAll(page);
        return professorPage.stream().toList();
    }


    public List<Professor> getProfessorsByInput(String input) {
        return professorRepository.getProfessorsByInput(input.trim());
    }

    public Professor addProfessor(ProfessorDTO professorDTO) {
        String fname = professorDTO.getFname();
        String lname = professorDTO.getLname();
        String building = professorDTO.getBuilding();
        String email = professorDTO.getEmail();
        String departmentString = professorDTO.getDepartment();
        String office = professorDTO.getOffice();
        String tel = professorDTO.getTel();
        String imgUrl = professorDTO.getImgUrl();
        String title = professorDTO.getTitle();

        Department department = departmentService.getDepartments(departmentString);

        Professor professor = new Professor(imgUrl, fname, lname, department, title, tel, email, building, office);
        return professorRepository.save(professor);
    }

    public List<Professor> addManyProfessors(List<ProfessorDTO> professors) {
        professors.forEach(this::addProfessor);
        return professorRepository.findAll();
    }
}
