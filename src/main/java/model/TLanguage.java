package model;

public class TLanguage {
    private Integer langid;

    private String language;

    private String description;

    public Integer getLangid() {
        return langid;
    }

    public void setLangid(Integer langid) {
        this.langid = langid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "TLanguage{" +
                "langid=" + langid +
                ", language='" + language + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}