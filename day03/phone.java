public class phone {
	 
     	String name;
     	String brand;
     	int price;
     	void call(){
     		System.out.println("��绰....");
     	}
     	void sendMsg(){
     		System.out.println("������....");
     	}
     
	 public static void main(String[] args){
		 phone p=new phone();
		 p.name="note";
		 p.brand="ƻ��";
		 p.price=998;
		 p.call();
		 p.sendMsg();
				 
	 }

}
