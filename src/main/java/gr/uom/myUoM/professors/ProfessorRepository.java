package gr.uom.myUoM.professors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM professor WHERE fName LIKE '%?1%' OR lName LIKE '%?1% OR email LIKE '%?1%;")
    List<Professor> getProfessorsByInput(String input);
}
