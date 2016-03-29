
public class reverseWord {

	public static String reverseIt(String str){
		StringBuilder reverse = new StringBuilder();
		int j = str.length();
		
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)==' '){
				j=i;
			}else if(i==0 || str.charAt(i-1)==' '){
				if(reverse.length()!=0){
					reverse.append(' ');
				}
				reverse.append(str.substring(i, j));
			}
		}


		return reverse.toString();
	}

	


	public static void main(String[] args) {
		System.out.println(reverseIt("My name is Apoorv"));

	}

}
