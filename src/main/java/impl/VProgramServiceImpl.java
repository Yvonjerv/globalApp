package impl;

import mapperImpl.VProgramMapperImpl;
import model.VProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.VProgramService;

import java.util.List;

@Service
public class VProgramServiceImpl implements VProgramService {
    @Autowired
    private VProgramMapperImpl programMapper;

    @Override
    public List<VProgram> getPrograms() {
        return programMapper.select();
    }

    @Override
    public VProgram selectProgramById(int programid) {
        return programMapper.selectByPrimaryKey(programid);
    }

    @Override
    public List<VProgram> getProgramsSelectiveAnd(VProgram record) {
        return programMapper.selectBySelectiveAnd(record);
    }

    @Override
    public List<VProgram> getProgramsSelectiveOr(VProgram record) {
        return programMapper.selectBySelectiveOr(record);
    }
}
