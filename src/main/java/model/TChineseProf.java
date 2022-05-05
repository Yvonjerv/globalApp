package model;

public class TChineseProf {
    private Integer chineseprofid;

    private String hsklevel;

    private String hskscore;

    private String hskdate;

    private String hsktickedno;

    private String hskklevel;

    private String hskkscore;

    private String hskkdate;

    private Integer userid;

    public Integer getChineseprofid() {
        return chineseprofid;
    }

    public void setChineseprofid(Integer chineseprofid) {
        this.chineseprofid = chineseprofid;
    }

    public String getHsklevel() {
        return hsklevel;
    }

    public void setHsklevel(String hsklevel) {
        this.hsklevel = hsklevel == null ? null : hsklevel.trim();
    }

    public String getHskscore() {
        return hskscore;
    }

    public void setHskscore(String hskscore) {
        this.hskscore = hskscore == null ? null : hskscore.trim();
    }

    public String getHskdate() {
        return hskdate;
    }

    public void setHskdate(String hskdate) {
        this.hskdate = hskdate;
    }

    public String getHsktickedno() {
        return hsktickedno;
    }

    public void setHsktickedno(String hsktickedno) {
        this.hsktickedno = hsktickedno == null ? null : hsktickedno.trim();
    }

    public String getHskklevel() {
        return hskklevel;
    }

    public void setHskklevel(String hskklevel) {
        this.hskklevel = hskklevel == null ? null : hskklevel.trim();
    }

    public String getHskkscore() {
        return hskkscore;
    }

    public void setHskkscore(String hskkscore) {
        this.hskkscore = hskkscore == null ? null : hskkscore.trim();
    }

    public String getHskkdate() {
        return hskkdate;
    }

    public void setHskkdate(String hskkdate) {
        this.hskkdate = hskkdate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TChineseprof{" +
                "chineseprofid=" + chineseprofid +
                ", hsklevel='" + hsklevel + '\'' +
                ", hskscore='" + hskscore + '\'' +
                ", hskdate=" + hskdate +
                ", hsktickedno='" + hsktickedno + '\'' +
                ", hskklevel='" + hskklevel + '\'' +
                ", hskkscore='" + hskkscore + '\'' +
                ", hskkdate=" + hskkdate +
                ", userid=" + userid +
                '}';
    }
}