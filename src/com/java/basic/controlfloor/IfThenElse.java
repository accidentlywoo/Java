package com.java.basic.controlfloor;

import java.util.Scanner;

public class IfThenElse {
	public static void main(String[] args) {
		int a=10, b=20;
		boolean flag=false;
		if(a>10) {
			System.out.println("a�� 10���� ũ��");
		}else {
			System.out.println("a�� 10���� ũ�� �ʴ�");
		}
		
		if(a==10 && b>=20) {
			System.out.println("������ ������");
		}else {
			System.out.println("������ �������� ����");
		}
		
		if(flag) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		
//		if - else if - else
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��϶�");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");
		}else if(jumsu>=80) {
			System.out.println("B");
		}else if(jumsu>=70) {
			System.out.println("C");
		}else if(jumsu>=60) {
			System.out.println("D");
		}else {}
		
	}
}