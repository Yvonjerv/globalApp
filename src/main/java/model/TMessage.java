package model;

public class TMessage {
    private Integer messageid;

    private Integer senderid;

    private Integer receiverid;

    private String status;

    private String messagenote;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getSenderid() {
        return senderid;
    }

    public void setSenderid(Integer senderid) {
        this.senderid = senderid;
    }

    public Integer getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Integer receiverid) {
        this.receiverid = receiverid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMessagenote() {
        return messagenote;
    }

    public void setMessagenote(String messagenote) {
        this.messagenote = messagenote == null ? null : messagenote.trim();
    }

    @Override
    public String toString() {
        return "TMessage{" +
                "messageid=" + messageid +
                ", senderid=" + senderid +
                ", receiverid=" + receiverid +
                ", status='" + status + '\'' +
                ", messagenote='" + messagenote + '\'' +
                '}';
    }
}