package impl;

import mapperImpl.TLanguageMapperImpl;
import model.TLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.LanguageService;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private TLanguageMapperImpl tLanguageMapper;

    @Override
    public int deleteLanguage(int languageid) {
        return tLanguageMapper.deleteByPrimaryKey(languageid);
    }

    @Override
    public int insertLanguage(TLanguage record) {
        return tLanguageMapper.insertSelective(record);
    }

    @Override
    public TLanguage selectLanguageById(int languageid) {
        return tLanguageMapper.selectByPrimaryKey(languageid);
    }

    @Override
    public List<TLanguage> getLanguagesSelective(TLanguage record) {
        return tLanguageMapper.selectBySelective(record);
    }

    @Override
    public int updateLanguage(TLanguage record) {
        return tLanguageMapper.updateByPrimaryKeySelective(record);
    }
}
