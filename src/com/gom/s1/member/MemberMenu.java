package com.gom.s1.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {

	public void start() {		
		MemberData memberData = new MemberData();
		MemberView memberView = new MemberView();
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDTO> ar = new ArrayList<>();
		memberData.memberInfo(ar);
		boolean flag = true;
		while(flag) {
			System.out.println("1. 주소록 전체 출력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 명단 추가");
			System.out.println("4. 주소록 명단 제거");
			System.out.println("5. 시스템 종료");
			int select = sc.nextInt();
		
			switch(select) {
			case 1: 
				System.out.println("=======	1. 주소록 전체 출력=====");
				memberView.view(ar);								
				break;
			case 2:
				System.out.println("=======	2. 주소록 검색 ========");
				memberView.search(ar);
				break;
			case 3:
				System.out.println("=======	3. 주소록 명단 추가 =====");
				
				MemberDTO memberDTO = memberData.addMember();
				ar.add(memberDTO);				
				System.out.println(ar);
				break;
			case 4:
				System.out.println("======= 4. 주소록 명단 제거 =====");
				boolean result = memberData.removeMember(ar);
				if(result) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}				
				break;
			case 5:
				System.out.println("======= 5. 시스템 종료 =========");				
				flag=false;
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");			
			}
		}
	}
}
