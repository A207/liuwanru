
public class Student {

	String name;
	String number;
	String address;
	void introduce(){
		System.out.println("我的名字是刘婉如，我的学号是2012214251，家住地址是安徽宿州。");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s=new Student();
     s.name="刘婉如";
     s.number="2012214251";
     s.address="安徽宿州";
    
     System.out.println(s.name);
     System.out.println(s.number);
     System.out.println(s.address);
     s.introduce();
	}

}
