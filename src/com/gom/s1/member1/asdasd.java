package com.gom.s1.member1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.gom.s1.member.MemberDTO;

public class asdasd {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		MemberDTO mDTO = new MemberDTO();
		
		String bir = "19970505";
		int y = Integer.parseInt(bir.substring(0,4));
		int m = Integer.parseInt(bir.substring(4,6))-1;
		int d = Integer.parseInt(bir.substring(6,8));
		ca.set(y, m, d);
		
		String pattern = "yyyy-MM-dd (E)";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);

		System.out.println(sd.format(ca.getTime()));

	}

}
