package service;

import model.TDepartment;
import model.TDepartment;

import java.util.List;

public interface DepartmentService {
    public int deleteDepartment(int departmentid);

    public int insertDepartment(TDepartment record);

    public TDepartment selectDepartmentById(int departmentid);
    public List<TDepartment> getDepartmentsSelective(TDepartment record);
    public int updateDepartment(TDepartment record);
}
