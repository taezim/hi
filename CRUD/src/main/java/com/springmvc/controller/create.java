package com.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.domain.Member;
import com.springmvc.repository.repository;


@Controller
@RequestMapping("/create")
public class create{

    @Autowired
    private repository database;  
    
    //-----------------------------------------------------------------------------------------------
    //JSP 폼을 제공하는 메서드
    @GetMapping("/jsp_form")
    public String bform() {
    		return "form1";
    }
    
    //Spring 폼을 제공하는 메서드
    @GetMapping("/spring_form")
    public String aform(Member member) {
    		return "form2";
    }
   //-----------------------------------------------------------------------------------------------
    //폼데이터 처리 before
    @PostMapping("/before") 
    public void before_data_insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        System.out.println("before_data_insert 입장");
    		//전처리
	    	String id = request.getParameter("id");
    		String name = request.getParameter("name");
    	
    		Member mb = new Member();
    		mb.setId(id);
    		mb.setName(name);
    		
    		//비지니스
    		//repository db = new repository();
    		database.create_data(mb);
        
    		//이동
    		response.sendRedirect("/CRUD/read/all");
    		
//      같은 create일 경우 아래의 코딩    		
//    	RequestDispatcher rd = request.getRequestDispatcher("all");
//		rd.forward(request, response);	
    } 
    
    //폼데이터 처리 after
    @PostMapping("/after") 
    public void after_data_insert(@ModelAttribute("Member") Member member,Model model,HttpServletResponse response) throws IOException { 
        //전처리
    	
    		//비지니스
    		database.create_data(member);
    		//이동
    		System.out.println("이동 스프링");
    		response.sendRedirect("/CRUD/read/all2");
    		
    } 
    
    
    //-------------------------------------------------------------------------------------------------
	//all view
    //JSP 폼을 제공하는 메서드

    
  
    
}
