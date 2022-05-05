package model;

import java.util.Date;

public class TPassport {
    private Integer passid;

    private String passportno;

    private Date issuedate;

    private Date expirationdate;

    private String embassy;

    private Integer userid;

    public Integer getPassid() {
        return passid;
    }

    public void setPassid(Integer passid) {
        this.passid = passid;
    }

    public String getPassportno() {
        return passportno;
    }

    public void setPassportno(String passportno) {
        this.passportno = passportno == null ? null : passportno.trim();
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getEmbassy() {
        return embassy;
    }

    public void setEmbassy(String embassy) {
        this.embassy = embassy == null ? null : embassy.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TPassport{" +
                "passid=" + passid +
                ", passportno='" + passportno + '\'' +
                ", issuedate=" + issuedate +
                ", expirationdate=" + expirationdate +
                ", embassy='" + embassy + '\'' +
                ", userid=" + userid +
                '}';
    }
}