package impl;

import mapperImpl.TProgramMapperImpl;
import model.TProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ProgramService;

import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {
    @Autowired
    private TProgramMapperImpl tProgramMapper;

    @Override
    public int deleteProgram(int programid) {
        return tProgramMapper.deleteByPrimaryKey(programid);
    }

    @Override
    public int insertProgram(TProgram record) {
        return tProgramMapper.insertSelective(record);
    }

    @Override
    public TProgram selectProgramById(int programid) {
        return tProgramMapper.selectByPrimaryKey(programid);
    }

    @Override
    public List<TProgram> getProgramsSelective(TProgram record) {
        return tProgramMapper.selectBySelective(record);
    }

    @Override
    public int updateProgram(TProgram record) {
        return tProgramMapper.updateByPrimaryKeySelective(record);
    }
}
