package dao;


import model.VProgram;

import java.util.List;

public interface VProgramMapper {


    VProgram selectByPrimaryKey(Integer programid);

    List<VProgram> select();

    List<VProgram> selectBySelectiveAnd(VProgram record);

    List<VProgram> selectBySelectiveOr(VProgram record);

}