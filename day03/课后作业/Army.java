package com.hfut.lwr.demo;

import java.util.Scanner;
//写一个类Army,代表一支军队，这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；
//该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,并用这一大小来初始化数组w.
//该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
//在这个类中还定义两个方法attackAll()和moveAll()，让w数组中的所有武器攻击和移动。
//写一个主方法去测试以上程序。
public class Army {
	private Weapon []w=null;
	private int num=0;
	private Army() {}
	public Army(int i) {
		  w = new Weapon[i];
		 }
	public void addWeapon(Weapon we) {
			  if (num >= w.length) {
				   System.out.println("武器已经达到最大!");
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
		System.out.println("输入最大的武器数量");
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
