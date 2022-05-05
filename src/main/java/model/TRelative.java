package model;

public class TRelative {
    private Integer relativeid;

    private String name;

    private String relationship;

    private String workplace;

    private String nationality;

    private String occupation;

    private String mobile;

    private String email;

    public String getRelativetype() {
        return relativetype;
    }

    public void setRelativetype(String relativetype) {
        this.relativetype = relativetype;
    }

    private String  address;
    private String relativetype;

    private Integer userid;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getRelativeid() {
        return relativeid;
    }

    public void setRelativeid(Integer relativeid) {
        this.relativeid = relativeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }



    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TRelative{" +
                "relativeid=" + relativeid +
                ", name='" + name + '\'' +
                ", relationship='" + relationship + '\'' +
                ", workplace='" + workplace + '\'' +
                ", nationality=" + nationality +
                ", occupation='" + occupation + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +", address='" +  address + '\'' +
                ", relativetype='" + relativetype + '\'' +
                ", userid=" + userid +
                '}';
    }
}