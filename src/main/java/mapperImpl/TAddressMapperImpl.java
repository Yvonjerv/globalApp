package mapperImpl;

import dao.TAddressMapper;
import model.TAddress;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAddressMapperImpl implements TAddressMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int deleteByPrimaryKey(Integer addressid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TAddressMapper.deleteByPrimaryKey", addressid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TAddress record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TAddressMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TAddress record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TAddressMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TAddress selectByPrimaryKey(Integer addressid) {
        session = sqlSessionFactory.openSession();
        TAddress address = session.selectOne("dao.TAddressMapper.selectByPrimaryKey", addressid);
        session.close();

        return address;
    }

    @Override
    public List<TAddress> selectBySelective(TAddress record) {
        session = sqlSessionFactory.openSession();
        List<TAddress> list = session.selectList("dao.TAddressMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TAddress record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TAddressMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TAddress record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TAddressMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
