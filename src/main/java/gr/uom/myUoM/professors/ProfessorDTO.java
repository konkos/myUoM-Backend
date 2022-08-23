package gr.uom.myUoM.professors;

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

    public ProfessorDTO(String imgUrl, String fname, String lname, String department, String title, String tel, String email, String building, String office) {
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
