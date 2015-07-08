
public class array3 {

	
	public static void main(String[] args) {
		int[] oldarr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int[] newarr=new int[oldarr.length];
		int j=0;
		for(int i=0;i<oldarr.length;i++){
			if(oldarr[i]!=0){
				newarr[j]=oldarr[i];
				j++;
			}
		}
		int k=j;
		for(j=0;j<k;j++){
			System.out.print(newarr[j]);
			System.out.print(",");
		}
		
	}

}
