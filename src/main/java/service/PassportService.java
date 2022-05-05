package service;

import model.TPassport;

import java.util.List;

public interface PassportService {
    public int deletePassport(int passportid);

    public int insertPassport(TPassport record);

    public TPassport selectPassportById(int passportid);
    public List<TPassport> getPassportsSelective(TPassport record);
    public int updatePassport(TPassport record);
}
