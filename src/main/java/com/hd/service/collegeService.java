package com.hd.service;

import org.springframework.stereotype.Service;

import com.hd.dto.CollegeDto;

@Service
public class collegeService {
	public void createMaster(CollegeDto cdto) {
		System.out.println(cdto.toString());
		}
	public void create2ndMAster(CollegeDto ccdto) {
		ccdto.setMajor("MAth");
		ccdto.setName("NarendreNAth");
		ccdto.setQualification("Master in Science");
		System.out.println(ccdto.toString());
	}
	public CollegeDto getMasterByNameNid() {
		
		CollegeDto cdto =new CollegeDto();
		cdto.setName("Sudhir");
		cdto.setMajor("History");
		cdto.setQualification("MA");
		System.out.println(cdto.toString());
		return cdto;
	}
	
	

}
