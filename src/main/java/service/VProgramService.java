package service;

import model.VProgram;

import java.util.List;

public interface VProgramService {

    public List<VProgram> getPrograms();

    public VProgram selectProgramById(int programid);

    public List<VProgram> getProgramsSelectiveAnd(VProgram record);
    public List<VProgram> getProgramsSelectiveOr(VProgram record);
}
