package service;


import model.TDegree;
import model.TDepartment;

import java.util.List;

public interface DegreeService {
    public List<TDegree> getDegrees();
    public List<TDegree> getDegreesSelective(TDegree record);
    public TDegree getDegreeById(int degreeid);
}
