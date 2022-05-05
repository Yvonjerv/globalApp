package service;

import model.TProgram;

import java.util.List;

public interface ProgramService {
    public int deleteProgram(int programid);

    public int insertProgram(TProgram record);

    public TProgram selectProgramById(int programid);
    public List<TProgram> getProgramsSelective(TProgram record);
    public int updateProgram(TProgram record);
}
