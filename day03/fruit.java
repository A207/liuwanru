
public class fruit {
         String name;
         int price;
         String address;
         fruit(){}//ϰ���ԵĹ���һ���޲ι��캯��.��Ϊ�й��췽����ϵͳ�㲻������Ĭ�ϵ�
         fruit(String n,int p,String add){
        	 name=n;
        	 price=p;
        	 address=add;
         }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fruit f=new fruit("�㽶",3,"�¼���");
        System.out.println(f.name+"\t"+f.price+"\t"+f.address);
        		
        		
	}

}
