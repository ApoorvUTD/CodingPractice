import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//counts of repeated character.
//aabcccccaaa will be a2b1c5a3.
//if the compressed string is same as original return the original string.
//assumption either all capital or all small.

public class stringCompression {

	public static  void compressor(String str){
		final int RADIX =10;
		char[] strArray = str.toCharArray();
		String result ="";
		int count =1;
		//char ch = Character.forDigit(count, RADIX);
		for(int i=1;i<strArray.length;i++){
			
			if(i==strArray.length-1 && strArray[i]==strArray[i-1]){
				count=count+1;
				result=result+strArray[i-1]+Character.forDigit(count, RADIX);
				break;
			}
			if(strArray[i]==strArray[i-1]){
				count=count+1;
			}
			if(strArray[i]!=strArray[i-1]){

				result=result+strArray[i-1]+Character.forDigit(count, RADIX);
				count=1;
			}
		}
		
		
		System.out.println(result);	
	}
	public static void main(String[] args) {
		String str = "abcd";
		compressor(str);

		//System.out.println("Original String was: "+str+"Compressed string is:"+compressed);

	}
}
