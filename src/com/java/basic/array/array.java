package com.java.basic.array;

public class array {
 public static void main(String[] args) {
	 int[] arr1 = {1,2,3};
	 int[] arr2 = arr1;
//	 int i;
	 for(int i=0;i<arr2.length;i++) {
		 System.out.println(arr2[i]);
	 }
	 System.out.println("�迭 arr1�� ������ : "+arr1);
	 System.out.println("�迭 arr2�� ������ : "+arr2);
	 
	 int[] src = {1,2,3,4,5}; //���� �迭
	 int[] dest = new int[3];
	 int i;
	 System.arraycopy(src, 1, dest, 0, 3); //�迭 ����
	 System.out.println("�����迭");
	 for(i=0;i<src.length;i++) {
		 System.out.println(src[i]+"\t");
	 }
	 System.out.println("\n����迭");
	 for(i=0;i<dest.length;i++) {
		 System.out.println(dest[i]+"\t");
	 }
	 dest[2]=50; //dest 2�� ��� �� ����
	 System.out.println("\n�����迭");
	 for(i=0;i<src.length;i++) {
		 System.out.println(src[i]+"\t");
	 }
	 System.out.println("\n����迭");
	 for(i=0;i<dest.length;i++) {
		 System.out.println(dest[i]+"\t");
	 }
 }
}
