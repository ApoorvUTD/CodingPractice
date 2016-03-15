package checkPermutationArray;

public class checkPerm {
	
	static boolean permute(String t1, String t2){
		if(t1.length()!=t2.length()){
			return false;
		}
		
		int[] letters = new int[128];
		char[] t1_array =t1.toCharArray();
		for (char c: t1_array){
			letters[c]++;
		}
		
		for (int i =0;i<t2.length();i++){
			int c = (int)t2.charAt(i);
			letters[c]--;
			
			if (letters[c]<0){
				
				return false;	
			}
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar1="sorry";
		String ar2="laundry";
		if(permute(ar1,ar2)){
			System.out.println("Yes it is permutation");
		}else {
			System.out.println("Nope");
		}

	}

}
