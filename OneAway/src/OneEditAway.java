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
		
		sort(str1);
		sort (str2);
		int c = 0,ik=0;
		int[] letters = new int[128];
		int[] letters1 = new int[128];

		
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		for (char c1: char2){
			letters[c1]++;
		}
		for (char c2: char1){
			letters1[c2]++;
		}
		
		if (str1.length()==str2.length()+1){
			for (int i=0;i<str2.length();i++){
				for(int j=0;j<str1.length();j++){
					System.out.println("Comparing "+str2.charAt(i)+" and "+str1.charAt(j));
					
					if (str2.toCharArray()[i]==str1.toCharArray()[j]){
						c=c+1;
						break;
					}else{
						ik=ik+1;
//						System.out.println(ik);
					}
				}
			}
			
			if (c==str2.length()){
				System.out.println(str1+" , "+str2+" ---> "+"True");
				
			}else{
				System.out.println(str1+" , "+str2+" ---> "+"False");
			}
		}else{System.out.println("Sorry extra changes");}
		
		
	}
	
	public static boolean replace(String str1,String str2){
		
		
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="master";
        String str2 ="sstte";
        
//        if (insert(str1,str2) || remove(str1,str2) || replace(str1,str2)){
//        	System.out.println(str1+" , "+str2+" ---> "+"true");
//        }else{
//        	System.out.println(str1+" , "+str2+" ---> "+"false");
//        }
        
        remove(str1,str2);
	}

}
