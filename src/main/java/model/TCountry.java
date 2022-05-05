package model;

public class TCountry {
    private String alpha;

    private String dial;

    private String nameCn;

    private String regionname;

    private String countryname;

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha == null ? null : alpha.trim();
    }

    public String getDial() {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial == null ? null : dial.trim();
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    @Override
    public String toString() {
        return "TCountry{" +
                "alpha='" + alpha + '\'' +
                ", dial='" + dial + '\'' +
                ", nameCn='" + nameCn + '\'' +
                ", regionname='" + regionname + '\'' +
                ", countryname='" + countryname + '\'' +
                '}';
    }
}