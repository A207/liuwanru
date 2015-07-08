package com.hfut.lwr.demo;

import java.util.Scanner;
//дһ����Army,����һ֧���ӣ��������һ��������Weapon����w�������洢�þ�����ӵ�е�������������
//���໹�ṩһ�����췽�����ڹ��췽����ͨ����һ��int���͵Ĳ������޶���������ӵ�е������������,������һ��С����ʼ������w.
//���໹�ṩһ������addWeapon(Weapon wa),��ʾ�Ѳ���wa��������������뵽����w�С�
//��������л�������������attackAll()��moveAll()����w�����е����������������ƶ���
//дһ��������ȥ�������ϳ���
public class Army {
	private Weapon []w=null;
	private int num=0;
	private Army() {}
	public Army(int i) {
		  w = new Weapon[i];
		 }
	public void addWeapon(Weapon we) {
			  if (num >= w.length) {
				   System.out.println("�����Ѿ��ﵽ���!");
				   return;
				  } else {
				   w[num] = we;
				   num++;
				  }
				 }
	public void attacAll() {
		  for (Weapon wea : w) {
		   if (wea != null) {
		    wea.attack();
		   }
		  }
		 }

		 public void moveAll() {
		  for (Weapon wea : w) {
		   if (wea != null) {
		    wea.move();
		   }
		  }
		 }
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		int num=input.nextInt();
		Army A=new Army(num);
		A.addWeapon(new Tank());
		  A.addWeapon(new Flighter());
		  A.addWeapon(new WarShip());
		  // a.addWeapon(new WarShip());
		  A.attacAll();
		  A.moveAll();
	}

		
	
}
