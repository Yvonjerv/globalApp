package model;

public class TStudyPlan {
    private Integer studyplanid;

    private Integer studyid;

    private String supervisor;

    private String supervisormobile;

    private String applicationno;

    public Integer getStudyplanid() {
        return studyplanid;
    }

    public void setStudyplanid(Integer studyplanid) {
        this.studyplanid = studyplanid;
    }

    public Integer getStudyid() {
        return studyid;
    }

    public void setStudyid(Integer studyid) {
        this.studyid = studyid;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public String getSupervisormobile() {
        return supervisormobile;
    }

    public void setSupervisormobile(String supervisormobile) {
        this.supervisormobile = supervisormobile == null ? null : supervisormobile.trim();
    }

    public String getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno == null ? null : applicationno.trim();
    }

    @Override
    public String toString() {
        return "TStudyPlan{" +
                "studyplanid=" + studyplanid +
                ", studyid=" + studyid +
                ", supervisor='" + supervisor + '\'' +
                ", supervisormobile='" + supervisormobile + '\'' +
                ", applicationno='" + applicationno + '\'' +
                '}';
    }
}