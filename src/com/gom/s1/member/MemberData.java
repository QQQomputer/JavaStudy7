package com.gom.s1.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	//ArrayList<MemberDTO> ar = new ArrayList<>();
	
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data="name1-moon1-id1@gmail.com-1111- 970101 -";
		this.data=this.data+"name2-moon2-id2@gmail.com-2222- 970202 -";
		this.data=this.data+"name3-moon3-id3@gmail.com-3333- 970303 -";
		this.data=this.data+"name4-moon4-id4@gmail.com-4444- 970404 -";
//		System.out.println(this.data);
	}
	
	public void memberInfo() {
		
		data="";
		
		
		
	}
	
	public MemberDTO addMember() {
		
		MemberDTO mDTO = new MemberDTO();
		
		System.out.println("이름 입력");
		mDTO.setName(sc.next());
		System.out.println("별명 입력");
		mDTO.setNick(sc.next());
		System.out.println("이메일 입력");
		mDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		mDTO.setNumber(sc.next());
		System.out.println("생일 입력");
		mDTO.setBirth(sc.next());		
		//ar.add(mDTO);
		return mDTO;		
	}
	
	public void removeMember(ArrayList<MemberDTO> ar) {
		System.out.println("삭제할 멤버 이름 입력");
		String str = sc.next();		
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(str)) {
				ar.remove(i);
				break;
			}
		}	
	}
	
	
}
