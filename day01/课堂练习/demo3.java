package com.geminno.demo;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //使用for输出1-100
		//int i;
		//for(i=1;i<100;i++)
		//{
		//	System.out.println(i);
		//}
		//for循环输出一个数组
		int [] integers={1,2,3,4,5};
	     for(int j=0;j<integers.length;j++)
		{
			System.out.println(integers[j]);
		}
		//使用for each语句
	     for(int i:integers)
		System.out.println(i);
			
	}

}
