package com.java.basic.controlfloor;

public class For {
	public static void main(String[] args) {
		int i, sum=0;
		
		System.out.println("1~100������ ��");
		for(i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("sum="+sum);
		
		System.out.println("1~100������ Ȧ��");
		for(i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i+"\t");
			}
			if(i%10==0) {
				
			}
		}
	}
}
