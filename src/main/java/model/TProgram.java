package model;

import java.math.BigDecimal;
import java.util.Date;

public class TProgram {
    private Integer programid;

    private Integer degreeid;

    private Integer majorid;

    private int duration;

    private Integer langid;

    private String status;

    private String startdate;

    private String enddate;

    private String notes;

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

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
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

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    @Override
    public String toString() {
        return "TProgram{" +
                "programid=" + programid +
                ", degreeid=" + degreeid +
                ", majorid=" + majorid +
                ", duration=" + duration +
                ", langid=" + langid +
                ", status='" + status + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", notes='" + notes + '\'' +
                '}';
    }
}