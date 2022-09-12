package gr.uom.myUoM.department;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartments(String name) {
        Optional<Department> byName = departmentRepository.findByName(name);
        return byName.orElseThrow(DepartmentNotFound::new);
    }

    public Department updateDepartment(Department updatedDepartment) {
        String name = updatedDepartment.getName();
        Optional<Department> byName = departmentRepository.findByName(name);
        Department department = byName.orElseThrow(DepartmentNotFound::new);

        department.setWebsite(updatedDepartment.getWebsite());
        return departmentRepository.save(department);
    }

    public Department addDepartment(Department department) {
        String name = department.getName();
        String website = department.getWebsite();
        String graduationWebSite = department.getGraduationWebSite();

        return departmentRepository.save(new Department(name, website, graduationWebSite));
    }
}
