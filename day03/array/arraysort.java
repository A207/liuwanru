
public class arraysort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr={12,34,25,16,24,19,10};
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length-i-1;j++)
    	 {
    		 if(arr[j]<arr[j+1])
    		 {
    			 int temp=arr[j];
    			 arr[j]=arr[j+1];
    			 arr[j+1]=temp;
    		 }
    	 }
     }
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]);
    	 System.out.print(",");
     }
	}

}
