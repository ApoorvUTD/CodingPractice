import java.util.HashSet;
import java.util.Set;

public class uniqueIdentifier {

	//make sure make a separate method
	//pass string
	//check base case
	static boolean checkUniqueString(String arr){
		if (arr == null ){
			System.out.println("Enter a valid String");
			return false;
		}

		if (arr.length()==1){
			System.out.println("Unique number");
			return true;
		}
		if (arr.isEmpty()){
			System.out.println("Please input");
		}

		int len = arr.length();
		Set<Character> set = new HashSet<Character>();
		for (int i=0;i<len;++i){
			set.add(arr.charAt(i));
		}
		if (set.size()==arr.length()){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String arr ="Apoorv";
		if (checkUniqueString(arr)){
			System.out.println("Unique");
		}else {
			System.out.println("Not Unique");
		}
	}

}
