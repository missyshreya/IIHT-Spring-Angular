package com.hr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.HR;
@Service
public class HrServiceImpl implements IhrService{

	//fake HR list
	List<HR> list= List.of(
			new HR(10001L, "Vivek","127846278453"),
			new HR(10002L, "Keshav","6839126489261"),
			new HR(10003L, "Kritika","5772894872982"),
			new HR(10004L, "Kamal","78903651892"),
			new HR(10005L, "Roshan","49276482616"),
			new HR(10006L, "Samir","68935231849"));
	
	@Override
	public HR getHR(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(hr-> hr.getUserID().equals(id)).findAny().orElse(null);
	}

	
	
	
}
