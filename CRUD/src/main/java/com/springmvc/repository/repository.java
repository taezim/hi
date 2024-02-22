package com.springmvc.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.springmvc.domain.Member;
@Repository
public class repository {
	public static ArrayList<Member> arr = new ArrayList<Member>();
	
	//c
	public void create_data(Member mb){
		System.out.println("리파지토리 데이터 삽입");
		arr.add(mb);
	}
	//r
	public ArrayList<Member> all_member(){
		System.out.println("멤버 리턴");
		return arr;
	}
		
	
	//u
	public Member getbyId(String id) {
		Member member=null;
		
		for(int i =0; i<arr.size();i++) {
			member = arr.get(i);
			if(member.getId().equals(id)) {
				return member;
			}
		}
		return null;
	}
	
	//d
	
	
}
