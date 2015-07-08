
public class array4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int[] arr2=new int[arr1.length];
		int index=0;
	    for(int i=0;i<arr1.length;i++){
	    	boolean flag=false;//默认表示没有找到相同的数字
	    	for(int j=0;j<index;j++){
	    		if(arr2[j]==arr1[i])
	    		{
	    			flag=true;
	    			break;
	    		}
	    	}
	    	if(!flag){
	    		arr2[index]=arr1[i];
	    		index++;
	    	}
	    }
	    int[] arr3=new int[index];
    	for(int k=0;k<index;k++){
    		arr3[k]=arr2[k];
    		System.out.print(arr2[k]+"\t");
	    }
	}

}
