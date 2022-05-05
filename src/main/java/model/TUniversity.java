package model;

public class TUniversity {
    private Integer universityid;

    private String universityname;

    private Integer locationid;

    private String universitydesc;

    private String weburl;

    private String universitykey;

    public String getUniversityKey() {
        return universitykey;
    }

    public void setUniversityKey(String universitykey) {
        this.universitykey = universitykey;
    }

    public Integer getUniversityid() {
        return universityid;
    }

    public void setUniversityid(Integer universityid) {
        this.universityid = universityid;
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname == null ? null : universityname.trim();
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getUniversitydesc() {
        return universitydesc;
    }

    public void setUniversitydesc(String universitydesc) {
        this.universitydesc = universitydesc == null ? null : universitydesc.trim();
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl == null ? null : weburl.trim();
    }


    @Override
    public String toString() {
        return "TUniversity{" +
                "universityid=" + universityid +
                ", universityname='" + universityname + '\'' +
                ", locationid=" + locationid +
                ", universitydesc='" + universitydesc + '\'' +
                ", weburl='" + weburl + '\'' +
                ", universitykey=" + universitykey +
                '}';
    }
}