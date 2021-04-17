package Practice;


import java.util.Scanner;
import java.util.Stack;

public class sachin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int i =scn.nextInt();
int j =scn.nextInt();
int k=scn.nextInt();


System.out.println(getsum(i, j, k));
	}
	
	public static int getsum(int i, int j , int k ) {
		Stack <Integer> st = new Stack<>();
		
		st.push(i);
		while(st.peek()!=j) {
			
			
			i+=1;
			st.push(i);
		}
		
		while(st.peek()!=k) {
		   i-=1;
		   st.push(i);
		}
		return sum(st);
	}

	public static int sum(Stack<Integer> st) {
		
		int sum=0;
		while(st.size()>0) {
			
			int v=(int) st.pop();
			sum+=v;
			
		}
		
		return sum;
		
		
	}
	  
}
