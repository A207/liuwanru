
public class Student {

	String name;
	String number;
	String address;
	void introduce(){
		System.out.println("�ҵ������������磬�ҵ�ѧ����2012214251����ס��ַ�ǰ������ݡ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s=new Student();
     s.name="������";
     s.number="2012214251";
     s.address="��������";
    
     System.out.println(s.name);
     System.out.println(s.number);
     System.out.println(s.address);
     s.introduce();
	}

}
