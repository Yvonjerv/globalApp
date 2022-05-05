package service;

import model.TLanguage;

import java.util.List;

public interface LanguageService {
    public int deleteLanguage(int languageid);

    public int insertLanguage(TLanguage record);

    public TLanguage selectLanguageById(int languageid);
    public List<TLanguage> getLanguagesSelective(TLanguage record);
    public int updateLanguage(TLanguage record);
}
