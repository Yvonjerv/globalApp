package model;

public class TDepartment {
    private Integer departmentid;

    private String departmentname;

    private String departmentdesc;

    private Integer universityid;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDepartmentdesc() {
        return departmentdesc;
    }

    public void setDepartmentdesc(String departmentdesc) {
        this.departmentdesc = departmentdesc == null ? null : departmentdesc.trim();
    }

    public Integer getUniversityid() {
        return universityid;
    }

    public void setUniversityid(Integer universityid) {
        this.universityid = universityid;
    }

    @Override
    public String toString() {
        return "TDepartment{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                ", departmentdesc='" + departmentdesc + '\'' +
                ", universityid=" + universityid +
                '}';
    }
}