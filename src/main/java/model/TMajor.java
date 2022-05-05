package model;

public class TMajor {
    private Integer majorid;

    private String majorname;

    private String researcharea;

    private String majordesc;

    private Integer departmentid;

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getResearcharea() {
        return researcharea;
    }

    public void setResearcharea(String researcharea) {
        this.researcharea = researcharea == null ? null : researcharea.trim();
    }

    public String getMajordesc() {
        return majordesc;
    }

    public void setMajordesc(String majordesc) {
        this.majordesc = majordesc == null ? null : majordesc.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    @Override
    public String toString() {
        return "TMajor{" +
                "majorid=" + majorid +
                ", majorname='" + majorname + '\'' +
                ", researcharea='" + researcharea + '\'' +
                ", majordesc='" + majordesc + '\'' +
                ", departmentid=" + departmentid +
                '}';
    }
}