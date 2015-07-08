
public class person {
      String name;
      int age;
      String address;
     //无参构造函数                        
      //构造函数是比较特殊的函数，没有返回类型，函数名和类名同名，并且在没有构造函数式，系统会自动生成一个构造函数
     /* person(){
    	  System.out.println("啊函数被调用。");
      };
      */
      //有参数构造函数
      person(String n,int a,String add){
    	  name=n;
    	  age=a;
    	  address=add;
      }
      //自我介绍
      void introduce(){
    	  System.out.println("大家好 ，我叫"+name+"我今年"+age+"我住在"+address);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       *进行实例化
       person p=new person();
      p.name="刘婉如";
      p.age=21;
      p.address="hefei";
      p.introduce();
      */
		//进行实例化并且赋值
		person p=new person("jim",13,"suzhou");
		
		p.introduce();
	}

}
