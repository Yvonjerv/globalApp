package model;

public class TEnglishProf {
    private Integer englishprofid;

    private String level;

    private String toefl;

    private String gre;

    private String ietls;

    private String gmat;

    private String duolingo;

    private String other;

    private Integer userid;

    public Integer getEnglishprofid() {
        return englishprofid;
    }

    public void setEnglishprofid(Integer englishprofid) {
        this.englishprofid = englishprofid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getToefl() {
        return toefl;
    }

    public void setToefl(String toefl) {
        this.toefl = toefl == null ? null : toefl.trim();
    }

    public String getGre() {
        return gre;
    }

    public void setGre(String gre) {
        this.gre = gre == null ? null : gre.trim();
    }

    public String getIetls() {
        return ietls;
    }

    public void setIetls(String ietls) {
        this.ietls = ietls == null ? null : ietls.trim();
    }

    public String getGmat() {
        return gmat;
    }

    public void setGmat(String gmat) {
        this.gmat = gmat == null ? null : gmat.trim();
    }

    public String getDuolingo() {
        return duolingo;
    }

    public void setDuolingo(String duolingo) {
        this.duolingo = duolingo == null ? null : duolingo.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TEnglishProf{" +
                "englishprofid=" + englishprofid +
                ", level='" + level + '\'' +
                ", toefl='" + toefl + '\'' +
                ", gre='" + gre + '\'' +
                ", ietls='" + ietls + '\'' +
                ", gmat='" + gmat + '\'' +
                ", duolingo='" + duolingo + '\'' +
                ", other='" + other + '\'' +
                ", userid=" + userid +
                '}';
    }
}