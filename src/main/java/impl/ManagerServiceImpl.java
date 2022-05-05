package impl;

import mapperImpl.TManagerMapperImpl;
import model.TManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ManagerService;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private TManagerMapperImpl tManagerMapperImpl;

    @Override
    public int deleteManager(Integer managername) {

        return tManagerMapperImpl.deleteByPrimaryKey(managername);
    }

    @Override
    public TManager login(String managername, String pwd) {
        TManager manager = new TManager();
        manager.setManagername(managername);
        manager.setPassword(pwd);
        List<TManager> list = tManagerMapperImpl.selectBySelective(manager);

        if (list.size() > 0) {
            return list.get(0);
        } else return null;
    }

    @Override
    public boolean isManagernameValid(String managername) {

        TManager manager = new TManager();
        manager.setManagername(managername);

        List<TManager> list = tManagerMapperImpl.selectBySelective(manager);

        if (list.size() > 0) {
            return true;
        } else return false;
    }

    @Override
    public boolean registerManager(TManager manager) {
        int row = tManagerMapperImpl.insertSelective(manager);
        if (row > 0) {
            return true;
        } else return false;
    }

    @Override
    public boolean modifyManager(TManager manager) {
        int row = tManagerMapperImpl.updateByPrimaryKeySelective(manager);
        if (row > 0) {
            return true;
        } else return false;

    }

    @Override
    public TManager getTManagerById(int managerid) {

        return tManagerMapperImpl.selectByPrimaryKey(managerid);
    }}
