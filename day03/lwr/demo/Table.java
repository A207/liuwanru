package com.hfut.lwr.demo;

public class Table {
	int row;
	int column;
	//public是访问修饰符
    public void showINfo(){
    	System.out.println("表格打印数据");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Table table=new Table();
      table.showINfo();
	}

}
