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
			System.out.println("输入错误");
		}
		else if(score>=60)
		{
			System.out.println("成绩及格");
		}
		else 
		{
			System.out.println("成绩不及格");
		}
	}
	

}
