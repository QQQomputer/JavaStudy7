package com.gom.s1.member;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	
	
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data="name1 - moon1 - id1@gmail.com - 1111 - 19970101 -";
		this.data=this.data+"name2 - moon2 - id2@gmail.com- 2222- 19970202 -";
		this.data=this.data+"name3 - moon3 - id3@gmail.com - 3333 - 19970303 -";
		this.data=this.data+"name4 - moon4 - id4@gmail.com-4444 - 19970404 -";
//		System.out.println(this.data);
	}
	
	public void memberInfo(ArrayList<MemberDTO> ar) {
		
		StringTokenizer st = new StringTokenizer(data, "-");
		MemberDTO memberDTO;
		Calendar ca = Calendar.getInstance();
		String str="";
		while(st.hasMoreTokens()) {
			memberDTO = new MemberDTO();
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setNick(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setNumber(st.nextToken().trim());
			str = st.nextToken().trim();
			ca.set(Integer.parseInt(str.substring(0,4)), Integer.parseInt(str.substring(4,6)), Integer.parseInt(str.substring(6,8)));
			memberDTO.setBirth(ca);			
			ar.add(memberDTO);
		}
		
		
		
		
	}
	
	public MemberDTO addMember() {
		Calendar ca = Calendar.getInstance();
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
		String bir = sc.next();
		int y = Integer.parseInt(bir.substring(0,4));
		int m = Integer.parseInt(bir.substring(4,6));
		int d = Integer.parseInt(bir.substring(6,8));
		ca.set(y, m, d);
		mDTO.setBirth(ca);		
		//ar.add(mDTO);
		return mDTO;		
	}
	
	
	//리턴 삭제여부 0:성공, 1: 실패	S:성공	F:실패	true:성공		false:실패
	public boolean removeMember(ArrayList<MemberDTO> ar) {
		System.out.println("삭제할 멤버 이름 입력");
		String str = sc.next();
		boolean result = false;
		MemberDTO memberDTO = new MemberDTO();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(str)) {
				memberDTO = ar.get(i);
				ar.remove(i);
				result=true;
				break;
			}
		}
		return result;
	}
	
	
}
