package Lec15;

import java.util.Arrays;



public class Soe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printprimes(25);
	}
 public static void printprimes(int n){
	 boolean[] primes = new boolean[n+1];
	 Arrays.fill(primes, true);
	 primes[0]=false;
	 primes[1]=false;
	  
	 for(int table=2;table*table<=n;table++) {
		 
		 if(primes[table]==true) {
			 
			 
		for (int mult=table;table*mult<=n;mult++) {

			primes[table*mult]=false;
			  
		 }
		 
		 
		 
	 }
	 
	
	
	 
 }
	 for(int i=2;i<=n;i++) {
		 if(primes[i]==true) {
		 
		 System.out.println(i+" ");
		 }
	 }
 }
}
