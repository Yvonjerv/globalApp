package service;

import model.TEmployBackground;

import java.util.List;

public interface EmployBackgroundService {
    public int deleteEmployBackground(int employbackgroundid);

    public int insertEmployBackground(TEmployBackground record);

    public TEmployBackground selectEmployBackgroundById(int employbackgroundid);
    public List<TEmployBackground> getEmployBackgroundsSelective(TEmployBackground record);
    public int updateEmployBackground(TEmployBackground record);
}
