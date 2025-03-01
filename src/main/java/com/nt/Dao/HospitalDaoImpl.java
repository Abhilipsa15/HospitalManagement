package com.nt.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.nt.model.Hospital;



@Repository("hospDao")
public class HospitalDaoImpl implements HospitalDao{
	private static final String GET_hOSP_QUERY="SELECT ID,NAME,CITY,STATE,PHN_NO,ZIPCODE,NO_OF_BEDS FROM HOSPITAL WHERE CITY IN(?,?,?) ORDER BY CITY";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Hospital> getHospital(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		List<Hospital> list=new ArrayList<Hospital>();
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_hOSP_QUERY);){
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try(ResultSet rs=ps.executeQuery()){
				while(rs.next()) {
					Hospital hosp=new Hospital();
					hosp.setId(rs.getInt(1));
					hosp.setName(rs.getString(2));
					hosp.setCity(rs.getString(3));
					hosp.setState(rs.getString(4));
					hosp.setPhn_no(rs.getString(5));
					hosp.setZipcode(rs.getInt(6));
					hosp.setNo_of_beds(rs.getInt(7));
					list.add(hosp);
					
				}
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
				
		
		return list;
	}
}