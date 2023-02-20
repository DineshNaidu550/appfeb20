package com.mcg.app.appfeb20;
public class Day_2022_09_25 {

	public Day_2022_09_25() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc";
		StringBuffer str2 = new StringBuffer("abc");
		
		System.out.println("str1 - "+str1+" "+str1.hashCode());
		System.out.println("str2 - "+str2+" "+str2.hashCode());
		
		str1 = "abc1";
		str2 = str2.append("2");
		
		System.out.println("str1 - "+str1+" "+str1.hashCode());
		System.out.println("str2 - "+str2+" "+str2.hashCode());

	}

}
