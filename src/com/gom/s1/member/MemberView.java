package com.gom.s1.member;

import java.util.List;
import java.util.Scanner;

public class MemberView {

	public void membersOut(List<MemberDTO> ar) {
		System.out.println("이름\t별명\t이메일\t\t전화번호\t생일");
		for(int i =0; i<ar.size();i++) {
			MemberDTO memberDTO = ar.get(i);			
			System.out.println(ar.get(i).getName()+"\t"+memberDTO.getNick()+"\t"+memberDTO.getEmail()+"\t"+memberDTO.getNumber()+"\t"+memberDTO.getBirth());
			
			
			//질문하는법	자기가 만든코드 자기가 제일 잘 앎
			//			고로 상대방에 아예 모른다는 전제하에 친절하게 설명해주면서 질문

//			System.out.println("Name : " +ar.get(i).getName());
//			System.out.println("Nick : " +memberDTO.getNick());
//			System.out.println("Email : " +memberDTO.getEmail());
//			System.out.println("Number : " +memberDTO.getNumber());
//			System.out.println("Birth : " +memberDTO.getBirth());
		}
		
		
		
	}
	
	public void view(List<MemberDTO> ar) {
		for(int i =0; i<ar.size();i++) {
				this.view(ar.get(i));			
		}
	}
	
	public void view(MemberDTO memberDTO) {
						
		System.out.println(memberDTO.getName()+"\t"+memberDTO.getNick()+"\t"+memberDTO.getEmail()+"\t"+memberDTO.getNumber()+"\t"+memberDTO.getBirth());	
		
	}
	
	public void search(List<MemberDTO> ar) {
		
		Scanner sc = new Scanner(System.in);
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("검색할 대상의 이름을 입력해주세요");
		String name = sc.next();
		boolean check= false;
		for(int i = 0; i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				this.view(ar.get(i));
				check=true;
				break;
			}

		}
		if(!check) {
			System.out.println("정보를 찾을 수 없습니다.");
		}				
	}	
}
