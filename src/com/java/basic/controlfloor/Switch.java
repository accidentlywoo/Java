package com.java.basic.controlfloor;

public class Switch {
//	byte,char,int,enum,String Ÿ�Ը� ��밡��
	public static void main(String[] args) {
		int a=1;
		switch(a) {
		case 1: case 2: case 3:
			System.out.println("1~3");
			break;//break�Ⱦ��� case�� ��ü����
		case 4: case 5:
			System.out.println("4~5");
			break;
		case 6: case 8:
			System.out.println("6,8");
			break;
		case 7: case 10:
			System.out.println("7,10");
			break;
		default:
			System.out.println("9�� 10�ʰ��� ��");
			break;
		}
		
	}

}
