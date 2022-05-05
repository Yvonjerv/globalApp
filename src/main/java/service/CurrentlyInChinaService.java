package service;

import model.TCurrentlyInChina;

import java.util.List;

public interface CurrentlyInChinaService {
    public int deleteCurrentlyInChina(int currentlyInChinaid);

    public int insertCurrentlyInChina(TCurrentlyInChina record);
    public List<TCurrentlyInChina> getCurrentlyInChinasSelective(TCurrentlyInChina record);
    public TCurrentlyInChina selectCurrentlyInChinaById(int currentlyInChinaid);

    public int updateCurrentlyInChina(TCurrentlyInChina record);
}
