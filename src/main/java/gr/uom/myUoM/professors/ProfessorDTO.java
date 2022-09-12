package gr.uom.myUoM.professors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProfessorDTO {
    private String imgUrl;
    private String fname;
    private String lname;
    private String department;
    private String title;
    private String tel;
    private String email;
    private String building;
    private String office;

}
