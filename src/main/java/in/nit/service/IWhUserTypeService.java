package in.nit.service;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeService {
	public Integer saveWhUserType(WhUserType ob);
	public List<WhUserType> getAllWhUserTypes();
}
