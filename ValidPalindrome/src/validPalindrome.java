
public class validPalindrome {

	public static void checkPalindrome(String str){
		String clean= str.replaceAll("[^a-zA-Z]+","").toLowerCase();
		System.out.println(clean);
		char[] charArray = clean.toCharArray();
		System.out.println(charArray.length);
		int len = 1;
		for (int i=0;i<charArray.length-1;i++){

			if (charArray[i]==charArray[charArray.length-1-i]){
				len=len+1;
			}else{
				len = len -1;
			}
		}
		
		if (len==charArray.length){
			System.out.println("Yup it is ");
		}else{
			System.out.println("cmon man give me something");
		}
	}



	public static void main(String[] args) {

		String str1 ="A man, a plan, a canal: Panama";
		String str2="race a car";
		String str3="jai hind";
		System.out.println(str1);
		checkPalindrome(str1);
		checkPalindrome(str2);
		checkPalindrome(str3);
		

	}
}
