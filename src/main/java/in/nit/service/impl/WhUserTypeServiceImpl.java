package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {
	@Autowired
	private IWhUserTypeDao dao;
	@Transactional
	public Integer saveWhUserType(WhUserType ob) {
		return dao.saveWhUserType(ob);
	}
	@Transactional(readOnly = true)
	public List<WhUserType> getAllWhUserTypes() {
			List<WhUserType> list=dao.getAllWhUserTypes();
			Collections.sort(list,(o1,o2)->o1.getWid()-o2.getWid());
			return list;
		
	}

}
