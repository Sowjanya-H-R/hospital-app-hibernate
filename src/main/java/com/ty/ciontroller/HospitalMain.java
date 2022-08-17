package com.ty.ciontroller;

import com.ty.dao.HospitalDao;
import com.ty.dto.Address;
import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class HospitalMain {
public static void main(String[] args) {
	HospitalDao dao=new HospitalDao();
	Hospital hospital=new Hospital();
	hospital.setName("Ayush");
	
	Branch branch1=new Branch();
	branch1.setName("Ayush mandya");
	Address address1=new Address();
	address1.setDistrictName("Mandya");
	address1.setPincode(571401);
	address1.setVillageName("Hallahalli");
	
	branch1.setAddresses(address1);
	
	
}
}
