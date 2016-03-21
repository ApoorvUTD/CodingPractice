# CodingPractice
MY dail Coding Practice:
1.IsPrime:

2



**************************************************************************************************************************************
ASCII is subset of Unicode. ASCII has 128 character whereas extended ASCII has 256 characters. 
String Uniqueness Problem: 1) use boolean array mark true if first time or else mark duplicate hence return false.2)use bit manipulation. As a to z can be taken care in 26 bit thus best choice will be a int which is 32 bit or 4 byte. Thus take checker as int and val is the value –'a' now the condition which comes into play is that if (checker && (1<<val))>0 that means its not unique hence false. After this just or the checker |= (1<<val) and return true,3)other way is using set data structure. 
String Permutation 1)length should be same, sorted array should be equal.2)this is exy method I would say for clarity, create an array of suppose 128 size . 
Sum of 2 numbers can be done thru 2 loops, hashmap where we add target-num(I). If sorted can  be done either using binary search and also can be done using two pointer technique. 
One Away problems: deletion and insertion are nearly same as one can be replicated by changing the position of inputs and others such as one edit away is simple and easy to achieve. 
URLify: it can be achieved using 2 scan technique. 
String compression: 
Rotate Matrix: 
Zero Matrix: 
String Rotation: 
Palindrome Permutation: 
IsPrime: check just from 2 wether its divisibly by 2 or not(not efficient as you have to go all the way just to gurantee prime, you can also check till n/2 or best go till I*I as this also solves are problem kind of mathematical so "keep calm and code")oh okay so there is another technique knowon as Prime Sieve(very similar to finding unique but with a pinch of lemon I.e. suppose all numbers are prime then pick 2 mark out its multiple, done pick 3 mark out its multiple done and so on.) 
