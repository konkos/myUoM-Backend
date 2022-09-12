package gr.uom.myUoM.department;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{depName}")
    public Department getDepartment(@PathVariable String depName){
        return departmentService.getDepartments(depName);
    }

    @PutMapping("/{depName}")
    public Department updateDepartment(@RequestBody Department updatedDepartment){
        return departmentService.updateDepartment(updatedDepartment);
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
}
