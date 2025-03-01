package com.nt.Dao;

import java.util.List;

import com.nt.model.Hospital;

public interface HospitalDao {
	public List<Hospital> getHospital(String desg1,String desg2,String desg3) throws Exception;
	
	
}
