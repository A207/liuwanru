

import java.util.Scanner;

public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//从命令参数中接收姓名，在程序打印 Hello xxxxx
		System.out.println("请输入您的姓名:");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();//输入字符串
		System.out.println("Hello "+name);
	}

}
