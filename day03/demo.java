
class demo{
	String name;
	int age;
	String address;
	demo(){}
	demo(String name,int age){
		this.name=name;//this是指当前实例对象，相当于”我“，点语法相当于”的“
		this.age=age;
	}
	demo(String name,int age,String address){
		/*
		this.name=name;//出现代码冗余，这时，可以用this来进行调用构造函数
		this.age=age;
		*/
		this.address=address;
	}
	void hello(){
		System.out.println("helo.....");
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\tadress:"+this.address);
		this.hello();
	}
	public static void main(String[] args){
		demo d=new demo("li",12,"suzou");
		System.out.println(d.name+d.age+d.address);
		d.introduce();
		
	}
}
/*
this指当前实例对象
1.this可以用在构造函数内部，用于区分同名成员和局部变量
2.this可以用于调用构造方法，减少代码冗余，，，，，注意，必须放构造方法的第一句话
3.this可以调用成员属性和成员方法
*/