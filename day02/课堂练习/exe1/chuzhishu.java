
public class chuzhishu {
//判断是否是质数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=14;
      boolean flag=true;
      for(int i=2;i<num;i++){
    	  if(num%i==0)
    	  { flag=false;
    	  break;
    	  }      
      }
      if(flag)
   	   System.out.println(num+"是质数");
      else
   	   System.out.println(num+"不是质数");
      
	}

}
