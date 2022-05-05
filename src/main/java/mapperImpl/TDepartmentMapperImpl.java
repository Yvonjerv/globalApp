package mapperImpl;

import dao.TDepartmentMapper;
import model.TDepartment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDepartmentMapperImpl implements TDepartmentMapper {

    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int deleteByPrimaryKey(Integer departmentid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TDepartmentMapper.deleteByPrimaryKey", departmentid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TDepartment record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TDepartmentMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TDepartment record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TDepartmentMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TDepartment selectByPrimaryKey(Integer departmentid) {
        session = sqlSessionFactory.openSession();
        TDepartment Department = session.selectOne("dao.TDepartmentMapper.selectByPrimaryKey", departmentid);
        session.close();

        return Department;
    }

    @Override
    public List<TDepartment> selectBySelective(TDepartment record) {
        session = sqlSessionFactory.openSession();
        List<TDepartment> list = session.selectList("dao.TDepartmentMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TDepartment record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TDepartmentMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TDepartment record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TDepartmentMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
