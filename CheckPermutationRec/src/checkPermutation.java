
public class checkPermutation {

	static //sort the string
	String sortIt(String str){
		//fill char array with string using toCharArray
		char[] content =str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);

	}


	//compare the sorted string if same means they are permutation
	static boolean permutation(String word1, String word2){
		if (word1.length() != word2.length()){
			return false;
		}

		return sortIt(word1).equals(sortIt(word2));

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String a = "abc";
		String b = "bca";
		if(permutation(a,b)){
			System.out.println("Yes they are permutation");
		}else {
			System.out.println("No its not Permutation");
		}
	}

}
