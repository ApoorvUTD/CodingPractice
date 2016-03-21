//O(n log n) runtime, O(1) space – Binary search:
//For each element x, we could look up if target – x exists in O(log n) time by applying
//binary search over the sorted array. Total runtime complexity is O(n log n).
public class twoSumbinary {
	
	public static void sortedArrayTwoSum(int[] A,int target){
		for(int i=0;i<A.length;i++){
			int j=binarySearch(A,target-A[i],i+1);
			if (j!=-1){
				System.out.println(i+"  "+j);
			}
		}
	}
	
	
	public static int binarySearch(int[] A,int key,int start){
		int L = 0;
		int R = A.length-1;
		int M = 0;
		
		while(L<R){
			M=(L+R)/2;
			if(A[M]<key){
				L=M+1;
			}else{
				R=M;
			}
		}
		return (L==R && A[M]==key)? L : -1;
	}
	
	public static void main(String[] args) {
		int[] Array ={2,5,7,9,12,18};
		int target = 21;
		sortedArrayTwoSum(Array,target);
		
	}

}
