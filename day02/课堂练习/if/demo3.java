package com.geminno.demo;

import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		if(score<0||score>100)
		{
			System.out.println("�������");
		}
		else if(score>=60)
		{
			System.out.println("�ɼ�����");
		}
		else 
		{
			System.out.println("�ɼ�������");
		}
	}
	

}
