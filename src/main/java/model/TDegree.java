package model;

public class TDegree {
    private Integer degreeid;

    private String degreename;

    private String degreedesc;

    private Integer requirementId;

    public Integer getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(Integer degreeid) {
        this.degreeid = degreeid;
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename == null ? null : degreename.trim();
    }

    public String getDegreedesc() {
        return degreedesc;
    }

    public void setDegreedesc(String degreedesc) {
        this.degreedesc = degreedesc == null ? null : degreedesc.trim();
    }

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    @Override
    public String toString() {
        return "TDegree{" +
                "degreeid=" + degreeid +
                ", degreename='" + degreename + '\'' +
                ", degreedesc='" + degreedesc + '\'' +
                ", requirementId=" + requirementId +
                '}';
    }
}