package model;

import java.util.Date;

public class TPersonalDetail {
    private Integer personid;

    private String firstname;

    private String lastname;

    private String chinesename;

    private String gender;

    private String religion;

    private String marital;

    private String nationality;

    private String dateofbirth;

    private String birthplace;

    private String birthcountry;

    private String nativelang;

    private String highestdegree;

    private String institution;

    private String occupation;

    private String healthstatus;

    private String hobby;

    private String photourl;

    private Integer userid;

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getChinesename() {
        return chinesename;
    }

    public void setChinesename(String chinesename) {
        this.chinesename = chinesename == null ? null : chinesename.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion == null ? null : religion.trim();
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry == null ? null : birthcountry.trim();
    }

    public String getNativelang() {
        return nativelang;
    }

    public void setNativelang(String nativelang) {
        this.nativelang = nativelang == null ? null : nativelang.trim();
    }

    public String getHighestdegree() {
        return highestdegree;
    }

    public void setHighestdegree(String highestdegree) {
        this.highestdegree = highestdegree == null ? null : highestdegree.trim();
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution == null ? null : institution.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getHealthstatus() {
        return healthstatus;
    }

    public void setHealthstatus(String healthstatus) {
        this.healthstatus = healthstatus == null ? null : healthstatus.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TPersonalDetail{" +
                "personid=" + personid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", chinesename='" + chinesename + '\'' +
                ", gender='" + gender + '\'' +
                ", religion='" + religion + '\'' +
                ", marital='" + marital + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", birthplace='" + birthplace + '\'' +
                ", birthcountry='" + birthcountry + '\'' +
                ", nativelang='" + nativelang + '\'' +
                ", highestdegree='" + highestdegree + '\'' +
                ", institution='" + institution + '\'' +
                ", occupation='" + occupation + '\'' +
                ", healthstatus='" + healthstatus + '\'' +
                ", hobby='" + hobby + '\'' +
                ", photourl='" + photourl + '\'' +
                ", userid=" + userid +
                '}';
    }
}