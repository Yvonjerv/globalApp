package model;

public class TLocation {
    private Integer locationid;

    private String city;

    private String province;

    private String type;

    private String population;

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population == null ? null : population.trim();
    }

    @Override
    public String toString() {
        return "TLocation{" +
                "locationid=" + locationid +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", type='" + type + '\'' +
                ", population='" + population + '\'' +
                '}';
    }
}