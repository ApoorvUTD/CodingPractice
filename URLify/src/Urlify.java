import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Urlify {


	//%20 is two spaces so what we should do??
	//count for spaces
	//then multiply by 2 because one space u r getting which is used in general u need 3 spaces
	//and allocate spaces 
	//after that insert the spaces at the places its due


	static void converturl(char[] str, int Length){
		//Counted number of space
		@SuppressWarnings("unused")
		int noOfSpaces= 0,newLength=0;
		for (int i=0;i<Length;i++){

			if (str[i]==' '){
				noOfSpaces++;

			}
		}

		newLength = Length+(noOfSpaces*2);//space enough to incorporate 2 more letters per space

		str[newLength]= '\0'; 
		for (int i = Length-1;i>=0;i--){
			if (str[i]==' '){
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength = newLength-3;
			}
			else {
				str[newLength-1]=str[i];
				newLength = newLength - 1;

			}
		}
		System.out.println(str.length);
		System.out.println(str); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' '};
		int trueLength=7;
		converturl(ch,trueLength);
	}

}
