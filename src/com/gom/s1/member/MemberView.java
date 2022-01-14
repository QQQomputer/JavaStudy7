package com.gom.s1.member;

import java.util.List;

public class MemberView {

	public void membersOut(List<MemberDTO> ar) {
		
		for(int i =0; i<ar.size();i++) {
			//질문하는법
			MemberDTO memberDTO = ar.get(i);
			System.out.println("Name : " +ar.get(i).getName());
			System.out.println("Nick : " +memberDTO.getNick());
			System.out.println("Email : " +memberDTO.getEmail());
			System.out.println("Number : " +memberDTO.getNumber());
			System.out.println("Birth : " +memberDTO.getBirth());

		}
		
		
		
	}
	public void search(String name) {
		
		
	}
	
	
	
}
