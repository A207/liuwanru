package com.hfut.lwr.demo03;
import com.hfut.lwr.demo.Table;//ֻ�ܵ���һ��ͬ�����еİ�
import com.hfut.lwr.demo.*;//*������ʾ����ð��е������ֻ࣬�����ܵĵ���������Ҫ����


public class demo {

	public static void main(String[] args) {
		// ���ñ�İ��е��࣬������ʹ��ȫ����ʹ��
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
