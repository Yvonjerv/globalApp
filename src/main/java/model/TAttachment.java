package model;

public class TAttachment {
    private Integer attachmentid;

    private Integer userid;

    private String applicationno;

    private String passport;

    private String visa;

    private String highestdegree;

    private String transcript;

    private String recommendationletter1;

    private String recommendationletter2;

    private String physicalexamination;

    private String studyplan;

    private String bankstatement;

    private String englishproficiency;

    private String chineseproficiency;

    private String noncriminal;

    private String cv;

    private String other;

    public Integer getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(Integer attachmentid) {
        this.attachmentid = attachmentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport == null ? null : passport.trim();
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa == null ? null : visa.trim();
    }

    public String getHighestdegree() {
        return highestdegree;
    }

    public void setHighestdegree(String highestdegree) {
        this.highestdegree = highestdegree == null ? null : highestdegree.trim();
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript == null ? null : transcript.trim();
    }

    public String getRecommendationletter1() {
        return recommendationletter1;
    }

    public void setRecommendationletter1(String recommendationletter1) {
        this.recommendationletter1 = recommendationletter1 == null ? null : recommendationletter1.trim();
    }

    public String getRecommendationletter2() {
        return recommendationletter2;
    }

    public void setRecommendationletter2(String recommendationletter2) {
        this.recommendationletter2 = recommendationletter2 == null ? null : recommendationletter2.trim();
    }

    public String getPhysicalexamination() {
        return physicalexamination;
    }

    public void setPhysicalexamination(String physicalexamination) {
        this.physicalexamination = physicalexamination == null ? null : physicalexamination.trim();
    }

    public String getStudyplan() {
        return studyplan;
    }

    public void setStudyplan(String studyplan) {
        this.studyplan = studyplan == null ? null : studyplan.trim();
    }

    public String getBankstatement() {
        return bankstatement;
    }

    public void setBankstatement(String bankstatement) {
        this.bankstatement = bankstatement == null ? null : bankstatement.trim();
    }

    public String getEnglishproficiency() {
        return englishproficiency;
    }

    public void setEnglishproficiency(String englishproficiency) {
        this.englishproficiency = englishproficiency == null ? null : englishproficiency.trim();
    }

    public String getChineseproficiency() {
        return chineseproficiency;
    }

    public void setChineseproficiency(String chineseproficiency) {
        this.chineseproficiency = chineseproficiency == null ? null : chineseproficiency.trim();
    }

    public String getNoncriminal() {
        return noncriminal;
    }

    public void setNoncriminal(String noncriminal) {
        this.noncriminal = noncriminal == null ? null : noncriminal.trim();
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv == null ? null : cv.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    @Override
    public String toString() {
        return "TAttachment{" +
                "attachmentid=" + attachmentid +
                ", userid=" + userid +
                ", applicationno=" + applicationno +
                ", passport='" + passport + '\'' +
                ", visa='" + visa + '\'' +
                ", highestdegree='" + highestdegree + '\'' +
                ", transcript='" + transcript + '\'' +
                ", recommendationletter1='" + recommendationletter1 + '\'' +
                ", recommendationletter2='" + recommendationletter2 + '\'' +
                ", physicalexamination='" + physicalexamination + '\'' +
                ", studyplan='" + studyplan + '\'' +
                ", bankstatement='" + bankstatement + '\'' +
                ", englishproficiency='" + englishproficiency + '\'' +
                ", chineseproficiency='" + chineseproficiency + '\'' +
                ", noncriminal='" + noncriminal + '\'' +
                ", cv='" + cv + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}