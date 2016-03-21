//Similar to Question [1. Two Sum], except that the input array is already sorted in
//ascending order.
public class TWOsUMsORTED {
	
	
	//binary search approach
	public static void twoSum(int[] array,int target){
		
	}
	
	//two pointer approach
	public static void twoSum2pointer(int[] array,int target){
		
			int j=array.length-1;
			int i=0;
			while(i<j){
			if(array[i]+array[j]>target){
				j--;
			}
			if(array[i]+array[j]<target){
				i++;
				
				
			}
			else{
				
				System.out.println(array[i]+array[j]);
				break;
			}
		}
	
	}
	
	public static void main(String[] args) {
		int[] array={2,4,3,1,6,7,8};
		int target=15;
		twoSum2pointer(array,target);
	}

}
