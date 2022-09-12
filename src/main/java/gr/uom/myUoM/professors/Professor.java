package gr.uom.myUoM.professors;

import gr.uom.myUoM.department.Department;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imgUrl;
    private String fname;
    private String lname;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    private String title;
    private String tel;
    private String email;
    private String building;
    private String office;


    public Professor(String imgUrl, String fname, String lname, Department department, String title, String tel, String email, String building, String office) {
        this.imgUrl = imgUrl;
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.title = title;
        this.tel = tel;
        this.email = email;
        this.building = building;
        this.office = office;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
