package model;

public class TEmployBackground {
    private Integer employmentid;

    private String fromdate;

    private String todate;

    private String company;

    private String jobtitle;

    private Integer userid;

    public Integer getEmploymentid() {
        return employmentid;
    }

    public void setEmploymentid(Integer employmentid) {
        this.employmentid = employmentid;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle == null ? null : jobtitle.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TEmploybackground{" +
                "employmentid=" + employmentid +
                ", fromdate=" + fromdate +
                ", todate=" + todate +
                ", company='" + company + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", userid=" + userid +
                '}';
    }
}