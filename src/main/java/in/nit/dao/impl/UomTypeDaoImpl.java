package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomTypeDao;
import in.nit.model.UomType;
@Repository
public class UomTypeDaoImpl implements IUomTypeDao {
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveUomType(UomType ob) {
		ht.save(ob); 
		return (Integer) ht.save(ob);
	}
	@Override
	public List<UomType> getAllUomTypes() {
		
		return ht.loadAll(UomType.class);
	}
	@Override
	public void deleteUomType(Integer id) {
		ht.delete(new UomType(id));
		
	}

}
