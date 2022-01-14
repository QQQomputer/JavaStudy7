package com.gom.s1.human;

import java.util.ArrayList;
import java.util.HashMap;

public class HumanMain {

	public static void main(String[] args) {
		
		HumanMenu hm = new HumanMenu();
		hm.select();
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("a", ar);
		map.put("b", ar2);
		//a인 사람만 쭉 모으는 것
		//b로 시작하는 사람만 쭉 모으는 것
	}

	
	//이름을 입력 받아서 같은 이름이 있는 HumanDTO 찾아서 리턴
	//찾아서 삭제
	//리턴 삭제여부
	
	
}
