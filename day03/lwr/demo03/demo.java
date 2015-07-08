package com.hfut.lwr.demo03;
import com.hfut.lwr.demo.Table;//只能导入一个同名类中的包
import com.hfut.lwr.demo.*;//*并不表示导入该包中的所有类，只是智能的导入我们需要的类


public class demo {

	public static void main(String[] args) {
		// 引用别的包中的类，，，，使用全类名使用
		/*com.hfut.lwr.demo.Table table=new com.hfut.lwr.demo.Table();
		table.showINfo();
		com.hfut.lwr.demo02.Table table1=new com.hfut.lwr.demo02.Table();
		table1.forEating();
		*/
		Table table=new Table();
		table.showINfo();
		
		com.hfut.lwr.demo02.Table table1=new com.hfut.lwr.demo02.Table();
		table1.forEating();
	}

}
