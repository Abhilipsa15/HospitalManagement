package com.nt.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Hospital;
import com.nt.service.HospitalService;

@Controller("payroll")
public class PayRollOperationController {
	@Autowired
	private HospitalService service;
	
	public List<Hospital> showallhospitalbydesg(String desg1,String desg2,String desg3) throws Exception{
		List<Hospital> list=service.fetchallhospitaldesg(desg1, desg2, desg3);
		return list;
	}

}
