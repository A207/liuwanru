
public class array2 {

//定义数组求最大值和最小值
	public static void main(String[] args) {
		int[] arr={12,3,6,8,6};
		int sum=0;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(arr[i]>max)
			{max=arr[i];}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("sum="+sum);
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
