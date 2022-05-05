package model;

public class TApplication {
    private String applicationno;

    private Integer userid;

    private Integer programid;

    private Integer attachmentid;

    private String submitdate;

    private String status;

    private String comment;

    public String getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno == null ? null : applicationno.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProgramid() {
        return programid;
    }

    public void setProgramid(Integer programid) {
        this.programid = programid;
    }

    public Integer getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(Integer attachmentid) {
        this.attachmentid = attachmentid;
    }

    public String getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(String submitdate) {
        this.submitdate = submitdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Override
    public String toString() {
        return "TApplication{" +
                "applicationno='" + applicationno + '\'' +
                ", userid=" + userid +
                ", programid=" + programid +
                ", attachmentid=" + attachmentid +
                ", submitdate=" + submitdate +
                ", status='" + status + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}