import javax.annotation.processing.SupportedSourceVersion;

public class OneEditAway {

	public static String sort(String str){
		char[] a=str.toCharArray();
		java.util.Arrays.sort(a);
		return str;
	}

	public static boolean insert(String str1,String str2){


		return true;
	}

	public static void remove(String str1,String str2){
		int count=0;
		int[] letters = new int[128];
		char[] toChar1 = str1.toCharArray();
		char[] toChar2 = str2.toCharArray();

		//so i have counted the number of each character
		for (char c: toChar1){
			letters[c]++;
		}
		//2 scan approach: says scan once to count and scan second time to counter check
		if (str1.length()==str2.length()+1){
			for (int i=0;i<str2.length();i++){
				int c=str2.charAt(i);
				letters[c]--;
				if (letters[c]==0){
					count = count+1;
					System.out.println(count);
					
				}
				
			}
			if (count == str2.length()){
				System.out.println(str1+" , "+str2+" ---> "+"true");
			}else{
				System.out.println(str1+" , "+str2+" ---> "+"false");
			}






		}
	}

	public static boolean replace(String str1,String str2){


		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Apoorv";
		String str2 ="vroop";

		//        if (insert(str1,str2) || remove(str1,str2) || replace(str1,str2)){
		//        	System.out.println(str1+" , "+str2+" ---> "+"true");
		//        }else{
		//        	System.out.println(str1+" , "+str2+" ---> "+"false");
		//        }

		remove(str1,str2);
	}

}
