import java.util.HashMap;
import java.util.Map;

//Given an array of integers, find two numbers such that they add up to a specific target
//number.
//The function twoSum should return indices of the two numbers such that they add up to
//the target, where index1 must be less than index2. Please note that your returned answers
//(both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution.
//long startTime = System.nanoTime();
////code
//long endTime = System.nanoTime();
//System.out.println("Took "+(endTime - startTime) + " ns");
public class twoSum {

	static long startTime = System.nanoTime();
	
	//method o(n^2) two loops - BruteForce
	public static int[] bruteSum(int[] findSum, int target){
		int[] arr=new int[2];

		for (int i=0;i<findSum.length;i++){
			int j=0;
			for( j=i+1;j<findSum.length;j++){

				if (findSum[i]+findSum[j]==target){
					arr[0]=findSum[i];
					arr[1]=findSum[j];
				}

			}

		}



		return arr;
	}


	//method for hashMap O(n) - Sexy
	
	public static void findSumHash(int[] array,int target){
		Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++){
			if(map.containsKey(target-array[i])){
				int val1=map.get(target-array[i]);
				int val2=i;
				System.out.println(val1+" index+ "+val2+" index = "+target);
			}
			map.put(array[i], i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for brute force
		
		int[] findSum = {2,3,9,4,5};
		int target = 5;
		for (int i=0;i<bruteSum(findSum,target).length;i++){
			System.out.println("Integer "+i+"="+ bruteSum(findSum,target)[i]);
		}
		
		//for hashMap
		int[] findSum1 = {2,3,9,4,5};
		int target1 = 11;
		findSumHash(findSum1,target1);
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
	
	

}
