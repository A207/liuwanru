package com.hfut.lwr.Mabstract;
//һ����������г��󷽷�������������ǳ�����
public abstract class animal {
	//abstract���η�����ʾ��������ǳ��󷽷�
      public abstract void sleep();

}
//����̳г����࣬����Ҫʵ�ָ����е����г��󷽷�����������Ҳ�ǳ����
class tiger extends animal{
	public void sleep(){
		System.out.println("ſ��˯��������");
	}
}
class monkey extends animal{
	public void sleep(){
		System.out.println("����˯��������");
	}
}
//ĳ�������࣬�������п���û�г��󷽷���