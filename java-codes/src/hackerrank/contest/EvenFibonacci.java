package hackerrank.contest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/*
This problem is a programming version of Problem 2 from projecteuler.net

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, 
the first 10 terms will be:
1,2,3,5,8,13,21,34,55,89,⋯
By considering the terms in the Fibonacci sequence whose values do not exceed N, find the sum of the even-valued terms.

Input Format 
First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

Output Format 
Print the required answer for each test case.

Constraints 
1≤T≤105 
10≤N≤4×1016
Sample Input

2
10
100
Sample Output

10
44
 */
public class EvenFibonacci {
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			BigInteger n = new BigInteger(sc.next());
			BigInteger sum = BigInteger.ZERO;
			BigInteger a = BigInteger.ZERO;
			BigInteger b = BigInteger.ONE;
			BigInteger c=a.add(b);
			while(c.compareTo(n) < 0){//sum less than n
				if(isEven(c)){
					sum = sum.add(c);
				}
				//System.out.println(a.toString()+","+b.toString()+","+c.toString()+"  ---> "+sum.toString());
				a=b;
				b=c;
				c=a.add(b);
			}
			System.out.println(sum.toString());
		}
	}
	public static boolean isEven(BigInteger n){
		return n.remainder(new BigInteger("2")) == BigInteger.ZERO;
	}
}