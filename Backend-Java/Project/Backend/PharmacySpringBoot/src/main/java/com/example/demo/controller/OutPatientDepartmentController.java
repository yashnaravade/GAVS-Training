package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.OutPatientDepartment;
import com.example.demo.service.OutPatientDepartmentService;

@Controller
public class OutPatientDepartmentController {
	@Autowired
	OutPatientDepartmentService opds;
	@GetMapping("/opd")
	public String opdDisplay(Model model) {
	OutPatientDepartment opd = opds.getPatientById(2);
	model.addAttribute("patient", opd);
	return "opdDisplay";
	}
	@GetMapping("/opdlist")
	public String opdDisplayList(Model model) {
		Iterable<OutPatientDepartment> opd=opds.getAllPatients();
		model.addAttribute("showPatients",opd );
		return "opdList";
	}
	@GetMapping("/addopd")
	public ModelAndView addPatient() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("patients",new OutPatientDepartment());
		mv.setViewName("addPatients");
		return mv;
	}
	@PostMapping("/addopd")
	@ResponseBody
	public String opdAdd(OutPatientDepartment opd) {
		return opds.savePatients(opd);
	}

}
