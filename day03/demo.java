
class demo{
	String name;
	int age;
	String address;
	demo(){}
	demo(String name,int age){
		this.name=name;//this��ָ��ǰʵ�������൱�ڡ��ҡ������﷨�൱�ڡ��ġ�
		this.age=age;
	}
	demo(String name,int age,String address){
		/*
		this.name=name;//���ִ������࣬��ʱ��������this�����е��ù��캯��
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
thisָ��ǰʵ������
1.this�������ڹ��캯���ڲ�����������ͬ����Ա�;ֲ�����
2.this�������ڵ��ù��췽�������ٴ������࣬��������ע�⣬����Ź��췽���ĵ�һ�仰
3.this���Ե��ó�Ա���Ժͳ�Ա����
*/