package model;

import java.util.Date;

public class TCurrentlyInChina {
    private Integer currentchinaid;

    private String inchina;

    private String institution;

    private String visatype;

    private Date expirationdate;

    private Integer userid;

    public Integer getCurrentchinaid() {
        return currentchinaid;
    }

    public void setCurrentchinaid(Integer currentchinaid) {
        this.currentchinaid = currentchinaid;
    }

    public String getInchina() {
        return inchina;
    }

    public void setInchina(String inchina) {
        this.inchina = inchina == null ? null : inchina.trim();
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution == null ? null : institution.trim();
    }

    public String getVisatype() {
        return visatype;
    }

    public void setVisatype(String visatype) {
        this.visatype = visatype == null ? null : visatype.trim();
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TCurrentlyInChina{" +
                "currentchinaid=" + currentchinaid +
                ", inchina='" + inchina + '\'' +
                ", institution='" + institution + '\'' +
                ", visatype='" + visatype + '\'' +
                ", expirationdate=" + expirationdate +
                ", userid=" + userid +
                '}';
    }
}