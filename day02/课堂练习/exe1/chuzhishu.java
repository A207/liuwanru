
public class chuzhishu {
//�ж��Ƿ�������
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
   	   System.out.println(num+"������");
      else
   	   System.out.println(num+"��������");
      
	}

}
