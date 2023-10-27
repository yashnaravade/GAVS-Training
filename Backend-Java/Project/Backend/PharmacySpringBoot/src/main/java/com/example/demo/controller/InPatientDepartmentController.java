package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.InPatientDepartment;
import com.example.demo.service.InPatientDepartmentService;

@Controller
public class InPatientDepartmentController {
	@Autowired
	InPatientDepartmentService service;
	@GetMapping("/inp")
	public String inpDisplay(Model model) {
		Iterable<InPatientDepartment> inp=service.getActivePatients();
		model.addAttribute("patients",inp);
		return "ActivePatients";
		
	}
	@GetMapping("/addInp")
	public ModelAndView addInpPatient() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("addInp",new InPatientDepartment());
		mv.setViewName("addInpPatients");
		return mv;
	}
	@PostMapping("/addInp")
	@ResponseBody
	public String inpAdd(InPatientDepartment inp) {
		return service.savePatient(inp);
	}

}
