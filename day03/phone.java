public class phone {
	 
     	String name;
     	String brand;
     	int price;
     	void call(){
     		System.out.println("打电话....");
     	}
     	void sendMsg(){
     		System.out.println("发短信....");
     	}
     
	 public static void main(String[] args){
		 phone p=new phone();
		 p.name="note";
		 p.brand="苹果";
		 p.price=998;
		 p.call();
		 p.sendMsg();
				 
	 }

}
