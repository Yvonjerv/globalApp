package model;

import java.math.BigDecimal;
import java.util.Date;

public class VProgram {
    private String city;

    private String province;

    private String type;

    private String population;

    private Integer majorid;

    private String majorname;

    private String researcharea;

    private String majordesc;

    private Integer departmentid;

    private Integer programid;

    private Integer degreeid;

    private BigDecimal duration;

    private Integer langid;

    private String status;

    private Date startdate;

    private Date enddate;

    private String notes;

    private String universityname;

    private Integer locationid;

    private String universitydesc;

    private String weburl;

    private String universitykey;

    private String degreename;

    private String degreedesc;

    private Integer requirementId;

    private String departmentname;

    private String departmentdesc;

    private Integer universityid;

    private String language;

    private String description;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population == null ? null : population.trim();
    }

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

    public Integer getProgramid() {
        return programid;
    }

    public void setProgramid(Integer programid) {
        this.programid = programid;
    }

    public Integer getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(Integer degreeid) {
        this.degreeid = degreeid;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public Integer getLangid() {
        return langid;
    }

    public void setLangid(Integer langid) {
        this.langid = langid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname == null ? null : universityname.trim();
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getUniversitydesc() {
        return universitydesc;
    }

    public void setUniversitydesc(String universitydesc) {
        this.universitydesc = universitydesc == null ? null : universitydesc.trim();
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl == null ? null : weburl.trim();
    }

    public String getUniversitykey() {
        return universitykey;
    }

    public void setUniversitykey(String universitykey) {
        this.universitykey = universitykey == null ? null : universitykey.trim();
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename == null ? null : degreename.trim();
    }

    public String getDegreedesc() {
        return degreedesc;
    }

    public void setDegreedesc(String degreedesc) {
        this.degreedesc = degreedesc == null ? null : degreedesc.trim();
    }

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "VProgram{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", type='" + type + '\'' +
                ", population='" + population + '\'' +
                ", majorid=" + majorid +
                ", majorname='" + majorname + '\'' +
                ", researcharea='" + researcharea + '\'' +
                ", majordesc='" + majordesc + '\'' +
                ", departmentid=" + departmentid +
                ", programid=" + programid +
                ", degreeid=" + degreeid +
                ", duration=" + duration +
                ", langid=" + langid +
                ", status='" + status + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", notes='" + notes + '\'' +
                ", universityname='" + universityname + '\'' +
                ", locationid=" + locationid +
                ", universitydesc='" + universitydesc + '\'' +
                ", weburl='" + weburl + '\'' +
                ", universitykey='" + universitykey + '\'' +
                ", degreename='" + degreename + '\'' +
                ", degreedesc='" + degreedesc + '\'' +
                ", requirementId=" + requirementId +
                ", departmentname='" + departmentname + '\'' +
                ", departmentdesc='" + departmentdesc + '\'' +
                ", universityid=" + universityid +
                ", language='" + language + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}