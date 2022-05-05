package service;

import model.TManager;
import model.TManager;

import java.util.List;

public interface ManagerService {

//    public int deleteManager(int managerid);
//
//    public int insertManager(TManager record);
//
//    public TManager selectManagerById(int managerid);
//    public List<TManager> getManagersSelective(TManager record);
//    public int updateManager(TManager record);

    /**
     *
     * @param managerName
     * @return
     */
    public int deleteManager(Integer managerName);

    /**
     * Manager login service method
     * @param managerName   manager account for login
     * @param pwd   password for login
     * @return  TManager  successful return manager object, otherwise return null
     */
    public TManager login(String managerName, String pwd);

    /**
     * Check whether the manager account is available
     * @param managerName
     * @return boolean,If available, return true; if unavailable, return false
     */
    public boolean isManagernameValid(String managerName);

    /**
     * Registered users (including hotel administrators and ordinary members)
     * @param manager TManager object containing manager registration information
     * @return boolean,True is returned for successful and false for failed
     */
    public boolean registerManager(TManager manager);

    /**
     * Modify manager information
     * @param manager TManager object containing manager modification information
     * @return boolean,Return true for success and false for failure
     */
    public boolean modifyManager(TManager manager);

    /**
     * Returns the manager object of the specified managerName
     * @param managerId  Managerid to query
     * @return  The tmanager object is returned successfully,
     * and null is returned in case of failure
     */
    public TManager getTManagerById(int managerId);
}
