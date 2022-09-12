package gr.uom.myUoM.professors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM professor WHERE fName LIKE '%:input%' OR lName LIKE '%:input%' OR email LIKE '%:input%';")
    List<Professor> getProfessorsByInput(@Param("input") String input);
}
