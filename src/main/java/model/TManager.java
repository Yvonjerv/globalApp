package model;

public class TManager {
    private Integer managerid;

    private String managername;

    private String password;
     private String universityKey;


    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername == null ? null : managername.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUniversityKey() {
        return universityKey;
    }

    public void setUniversityKey(String universityKey) {
        this.universityKey = universityKey;
    }

    @Override
    public String toString() {
        return "TManager{" +
                "managerid=" + managerid +
                ", managername='" + managername + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}