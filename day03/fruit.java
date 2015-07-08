
public class fruit {
         String name;
         int price;
         String address;
         fruit(){}//习惯性的构造一个无参构造函数.因为有构造方法后，系统便不会生成默认的
         fruit(String n,int p,String add){
        	 name=n;
        	 price=p;
        	 address=add;
         }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fruit f=new fruit("香蕉",3,"新加坡");
        System.out.println(f.name+"\t"+f.price+"\t"+f.address);
        		
        		
	}

}
