package hackerrank;

import java.util.Scanner;

/*
 * Sherlock is stuck. He has an array A1,A2,⋯,AN. He wants to know if there exists a non empty subset of this array such that there doesn't exist any integer x (x>1) which divides all elements in that subset.

Input Format
First line contains T, the number of testcases. Each testcase consists of N in one line. The next line contains N integers denoting the array A.

Output
Print YES or NO, if there exists any such subset or not, respectively.

Constraints
1≤T≤10
1≤N≤100
1≤Ai≤105 ∀1≤i≤N

Sample input

2
3
1 2 3
2
2 4

Sample output

YES
NO

Explanation
In first testcase, S={1},S={1,2},S={1,3},S={2,3} and S={1,2,3} are all the possible subsets which satisfy the given condition.
In second testcase, no non-empty subset exists which satisfies the given condition. 
 */
public class SherlockGCD {
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++){
				arr[j] = sc.nextInt();
				//System.out.println(arr[j]);
			}
			checkGCD(arr);
		}
	}
	public static void checkGCD(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			if(i==1){
				continue;
			}
			for(int j = i+1; j< arr.length ;j++){
				if(!interDivisible(arr[i], arr[j])){
					System.out.println("YES-->"+arr[i]+","+arr[j]);
					
					return;
				}
			}
		}
		System.out.println("NO");
		return;
	}
	public static boolean interDivisible(int n, int m){
		return n%m ==0 || m%n==0 ; 
	}
}
/*
 * input:
10
52
35264 17632 17632 70528 35264 70528 17632 88160 35264 70528 70528 35264 17632 17632 17632 17632 17632 70528 35264 35264 17632 88160 52896 88160 70528 17632 70528 17632 52896 17632 17632 35264 88160 17632 70528 88160 17632 88160 52896 88160 70528 88160 70528 88160 88160 88160 35264 17632 17632 88160 35264 70528
60
5106 73623 20833 80256 83114 18694 55464 13975 30694 5735 2005 95231 61104 35301 49033 59523 5839 44215 65183 90295 14660 62782 47981 34999 86633 3205 89409 87661 53522 86434 76773 26186 44365 43601 10973 76810 1283 81629 44165 84818 67574 75769 60213 57427 21667 61632 52287 79494 5823 33242 38381 76655 79836 60280 98437 85051 5602 3893 81478 53284
74
69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932
27
28587 85761 85761 85761 28587 85761 28587 85761 28587 57174 85761 85761 85761 28587 57174 85761 85761 85761 85761 85761 28587 85761 28587 57174 57174 28587 28587
14
66694 14259 1710 57758 10303 28775 10037 7706 88458 76927 73054 56600 92544 7414
98
85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645
97
80390 40195 40195 40195 80390 80390 80390 80390 80390 40195 40195 40195 80390 80390 40195 40195 80390 80390 40195 40195 40195 40195 40195 80390 40195 40195 80390 40195 80390 40195 80390 40195 80390 40195 40195 40195 40195 80390 80390 40195 40195 40195 80390 40195 40195 80390 40195 40195 40195 80390 40195 80390 80390 80390 80390 80390 80390 40195 80390 80390 40195 80390 80390 80390 80390 40195 40195 80390 40195 40195 40195 40195 40195 40195 40195 40195 80390 40195 40195 40195 80390 80390 80390 80390 40195 80390 40195 40195 40195 40195 40195 80390 40195 80390 80390 80390 40195
6
76050 76050 76050 76050 76050 76050
55
81750 54500 54500 54500 27250 54500 54500 27250 54500 54500 27250 81750 81750 54500 81750 27250 27250 27250 81750 54500 54500 54500 27250 27250 81750 81750 54500 54500 81750 54500 54500 54500 27250 27250 27250 54500 54500 81750 81750 54500 54500 81750 54500 54500 27250 27250 54500 54500 27250 54500 54500 81750 27250 27250 54500
47
74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057
 * 
 * output:
 * 
NO
YES
NO
NO
YES
NO
NO
NO
NO
NO
 */