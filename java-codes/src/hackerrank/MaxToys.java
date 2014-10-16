package hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

/*
Mark and Jane are very happy after having their first kid. Their son is very fond of toys, so Mark wants to buy some. There are N different toys lying in front of him, tagged with their prices, but he has only $K. He wants to maximize the number of toys he buys with this money.

Now, you are Mark�s best friend and have to help him buy as many toys as possible.

Input Format
The first line will contain two inputs N and K, followed by a line containing N integers separated by a single space indicating the products� prices.

Output Format
Maximum number of toys Mark can buy for his son.

Constraints
1<=N<=105
1<=K<=109
1<=price of any toy<=109
A toy can�t be bought multiple times.

Sample Input

7 50
1 12 5 111 200 1000 10
Sample Output

4
Explanation

He can buy only 4 toys at most. These toys have the following prices: 1,12,5,10.
 */
public class MaxToys {
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		PriorityQueue<Integer> toyPriceSet = new PriorityQueue<>(); 
		for(int i=0;i<n;i++){
			toyPriceSet.add(sc.nextInt());
		}
		int toyCount = 0;
		int sum = 0;
		for(Integer price : toyPriceSet){
			if(sum < k){
				sum += price;
				toyCount++;
			}else{
				break;
			}
		}
		System.out.println(toyCount);
	}
}
