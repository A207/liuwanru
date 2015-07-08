package com.hfut.lwr.demo;
//定义3个类：Tank,Flighter,WarShip都继承自Weapon,分别用不同的方式实现 Weapon 类中的抽象方法。
public class Tank extends Weapon {
	public void attack() {
		  System.out.println("坦克攻击");
		 }

		 public void move() {
		  System.out.println("坦克移动");
		 }


}
