package stringPermutation;

public class Permutations {

	static void permutation(String str){
		permutation(str,"", 0);

	}

	static void permutation(String str,String prefix, int level){
		if (str.length() == 0) {
			System.out.println("**************final****************"+prefix);
		} else {
			
			System.out.println("STRING ENTERING "+str);
			for (int i=0;i<str.length();i++){
                System.out.println("#######Entering Loop "+i+"######");
				String rem =str.substring(0,i)+str.substring(i+1);
				System.out.println("1st Value-------> "+i +"==>"+ str.substring(0,i));
				System.out.println("2nd Value-------> "+i +"==>"+str.substring(i+1));
				System.out.println("Prefix --------->"+prefix);
				System.out.println("permutation("+rem+","+prefix+str.charAt(i)+") at level: "+level);
				permutation(rem, prefix+str.charAt(i), level + 1);
			}

		}
	}

	public static void main(String[] args) {
		permutation("CAT");

	}

}
