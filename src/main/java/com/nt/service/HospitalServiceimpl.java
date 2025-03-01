package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Dao.HospitalDao;
import com.nt.model.Hospital;

@Service("hospService")
public class HospitalServiceimpl implements HospitalService {
	@Autowired
private HospitalDao dao;
	@Override
	public List<Hospital> fetchallhospitaldesg(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		List<Hospital> list=dao.getHospital(desg1, desg2, desg3);
		return list;
	}
	

}
