package com.hfut.lwr.demo04;

import com.hfut.lwr.fangwen.A;

public class c extends A{
	public void methodc1(){
		System.out.println("public methodc1");
		A a=new A();
		
		a.methodA1();
		methodA4();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      c C=new c();
      C.methodc1();
      
   
      
	}

}
