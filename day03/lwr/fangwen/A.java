package com.hfut.lwr.fangwen;

public class A {
	public void methodA1(){
		System.out.println("public methodA1");
		
	}
    private void methodA2(){
		System.out.println("private methodA2");
		
	}
    //同一个包可以访问
    void methodA3(){
    	System.out.println("default methodA3");
    	
    }
  // pritected同一个包或者其子类
    protected void methodA4(){
    	System.out.println("protected void methodA4");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
