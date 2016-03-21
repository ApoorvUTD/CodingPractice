import java.util.Arrays;

public class isPrime {
	
	static boolean checkPrime(int n){
		for (int i = 2;i*2<n;i++){
			System.out.println("Checking divisibility by -->"+i);
			if ((n%i)==0){
				System.out.println("Trying"+ i);
				return false;
			}
		}
		return true;
	}
	
//	IsPrime: check just from 2 wether its divisibly by 2 or not(not efficient as you have to go all the way just 
//			to gurantee prime, you can also check till n/2 or best go till I*I as this also solves are problem kind of 
//			mathematical so "keep calm and code")oh okay so there is another technique known as Prime Sieve(very similar to 
//					finding unique but with a pinch of lemon I.e. suppose all numbers are prime then pick 2 mark out its multiple,
//					done pick 3 mark out its multiple done and so on.)
	
	static void primeSieve(int n){
		boolean[] primesieve = new boolean[n];
		Arrays.fill(primesieve,true);
		primesieve[0]=primesieve[1]=false;
		for (int i=2;i<primesieve.length;i++){
			if(primesieve[i]){
			for (int j=2;j*i<primesieve.length;j++){
				primesieve[j*i]=false;
			}
			}
			
		}
	}

	//returns the count of prime number which are there till n
	 public static int countPrimes(int n) {
		 int c =0;
	        boolean[] primecount = new boolean[n];
	        Arrays.fill(primecount,true);
	        if (n==0){
	        return c;
	        }
	        
	        if (n==1){
	        primecount[0]=false;	
	        return c;
	        }
	        
	        if(n>1){
	        	primecount[0]=false;	
		        primecount[1]=false;
	        for(int i=2;i<primecount.length;i++){
	            if (primecount[i]){
	                for (int j=2;j*i<primecount.length;j++){
	                    primecount[j*i]=false;
	                }
	            }
	        }
	        }
	        
	        for(int i=0;i<primecount.length;i++){
	        	if (primecount[i]){
	        		c=c+1;
	        	}
	        }
	        
	        return c;
	        
	    }
	    

	public static void main(String[] args) {
//		if(checkPrime(489)){
//			System.out.println("Yes, Sir its prime");
//		}else{
//			System.out.println("Sorry its not prime");
//		}
		
		System.out.println(countPrimes(1));
	}
}
