package in.nit.dao;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeDao {
public Integer saveWhUserType(WhUserType ob);
public List<WhUserType> getAllWhUserTypes();
}
