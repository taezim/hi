package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.domain.Member;
import com.springmvc.repository.repository;

@Controller
@RequestMapping("/read")
public class read {
	
    @Autowired
    private repository database;  
	
//---------------------------------- 전체 회원 정보 읽어오기 --------------------------------------	
    @GetMapping("/all")
    public String all_view(HttpSession session) {
    		//전처리
    		System.out.println("뷰페이지 입장");
    		//비지니스
    		List<Member> arr = database.all_member();
    		
    		//이동
    		session.setAttribute("arry", arr);
    		return "bview";
    }
//----------------------------------
    //after_spring
    @GetMapping("/all2")
    public String all_view_after(Model model) {
    		//전처리
    		System.out.println("뷰페이지2 입장");
    		//비지니스
    		ArrayList<Member> arr = database.all_member();
    		
    		//이동
    		model.addAttribute("members",arr);
    		return "aview";
    }
    
    
    
    
}
