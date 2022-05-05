package model;

public class TEduBackground {
    private Integer educationid;

    private String fromdate;

    private String todate;

    private String country;

    private String institution;

    private String field;

    private String degree;

    private Integer userid;

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution == null ? null : institution.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TEduBackground{" +
                "educationid=" + educationid +
                ", fromdate=" + fromdate +
                ", todate=" + todate +
                ", country='" + country + '\'' +
                ", institution='" + institution + '\'' +
                ", field='" + field + '\'' +
                ", degree='" + degree + '\'' +
                ", userid=" + userid +
                '}';
    }
}