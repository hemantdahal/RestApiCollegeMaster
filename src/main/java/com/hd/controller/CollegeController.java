package com.hd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hd.dto.CollegeDto;
import com.hd.service.collegeService;

@RestController
@RequestMapping("/master")
public class CollegeController {
	@Autowired
	private collegeService cservice;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createCollege(@RequestBody CollegeDto cdto) {
		cservice.createMaster(cdto);

	}

	@RequestMapping(value = "/super", method = RequestMethod.POST)
	public void createSecondCollege(@RequestBody CollegeDto csdto) {
		System.out.println(csdto.toString());
		cservice.create2ndMAster(csdto);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public CollegeDto getFromNAmeNId(@RequestParam(value = "rananame", required = true) String cname,
			@RequestParam(value = "Fid", required = false) Long cid) {
		System.out.println("name:" + cname + " ,id:" + cid);
		return cservice.getMasterByNameNid();

	}
	@RequestMapping(value="/{id}/preschool",method=RequestMethod.GET)
	public CollegeDto getMasterFromId(@PathVariable(value="id") Long mId
			,@RequestParam(value="school" ,required=true) String school,
			@RequestHeader(value="hd-sk") String suit) {
		System.out.println("id:"+ mId + ",school:"+ school+ "  ,suit:"+suit);
		return cservice.getMasterByNameNid();
		
		
	}
}
