package com.nt.service;

import java.util.List;
import com.nt.model.Hospital;

public interface HospitalService {
	public List<Hospital> fetchallhospitaldesg(String desg1,String desg2,String desg3) throws Exception;
}
