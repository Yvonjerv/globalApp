package service;

import model.TRelative;

import java.util.List;

public interface RelativeService {
    public int deleteRelative(int relativeid);

    public int insertRelative(TRelative record);

    public TRelative selectRelativeById(int relativeid);
    public List<TRelative> getRelativesSelective(TRelative record);
    public int updateRelative(TRelative record);
}
