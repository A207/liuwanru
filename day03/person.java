
public class person {
      String name;
      int age;
      String address;
     //�޲ι��캯��                        
      //���캯���ǱȽ�����ĺ�����û�з������ͣ�������������ͬ����������û�й��캯��ʽ��ϵͳ���Զ�����һ�����캯��
     /* person(){
    	  System.out.println("�����������á�");
      };
      */
      //�в������캯��
      person(String n,int a,String add){
    	  name=n;
    	  age=a;
    	  address=add;
      }
      //���ҽ���
      void introduce(){
    	  System.out.println("��Һ� ���ҽ�"+name+"�ҽ���"+age+"��ס��"+address);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       *����ʵ����
       person p=new person();
      p.name="������";
      p.age=21;
      p.address="hefei";
      p.introduce();
      */
		//����ʵ�������Ҹ�ֵ
		person p=new person("jim",13,"suzhou");
		
		p.introduce();
	}

}
