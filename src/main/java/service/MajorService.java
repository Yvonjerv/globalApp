package service;

import model.TMajor;


import java.util.List;

public interface MajorService {
    public int deleteMajor(int majorid);

    public int insertMajor(TMajor record);

    public TMajor selectMajorById(int majorid);
    public List<TMajor> getMajorsSelective(TMajor record);
    public int updateMajor(TMajor record);
}
