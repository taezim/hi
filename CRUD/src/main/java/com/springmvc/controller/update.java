package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.springmvc.domain.Member;
import com.springmvc.repository.repository;

@Controller
@RequestMapping("/update")
public class update {
	 
	
	@Autowired
	private repository database;   
	
	
	@GetMapping("/up_form2")
    public String bform(@RequestParam("id")String id,@ModelAttribute("member") Member member,Model model) {
	  	System.out.println(id);
	  	
	  	member = database.getbyId(id);
	  	model.addAttribute("model",member);
    		return "up_form2";
    }
	@PostMapping("/up_form2")
	public String conform_update() {
		
		return "redirect:/CRUD/read/all";
	}
	
}
