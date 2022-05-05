package mapperImpl;

import dao.VProgramMapper;
import model.VProgram;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VProgramMapperImpl implements VProgramMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public VProgram selectByPrimaryKey(Integer programid) {
        session = sqlSessionFactory.openSession();
        VProgram program = session.selectOne("dao.VProgramMapper.selectByPrimaryKey", programid);
        session.close();

        return program;
    }

    @Override
    public List<VProgram> select() {
        session = sqlSessionFactory.openSession();
        List<VProgram> list = session.selectList("dao.VProgramMapper.select");
        session.close();
        return list;
    }

    @Override
    public List<VProgram> selectBySelectiveAnd(VProgram record) {
        session = sqlSessionFactory.openSession();
        List<VProgram> list = session.selectList("dao.VProgramMapper.selectBySelectiveAnd", record);
        session.close();
        return list;
    }

    @Override
    public List<VProgram> selectBySelectiveOr(VProgram record) {
        session = sqlSessionFactory.openSession();
        List<VProgram> list = session.selectList("dao.VProgramMapper.selectBySelectiveOr", record);
        session.close();
        return list;
    }
}
