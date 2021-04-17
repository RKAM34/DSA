package LEC16;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 
	public static int [] mergesort(int[] arr, int lo , int hi) {
		
		
		if(lo==hi) {
			
			int []br = new int [1];
			br[0]=arr[0];
			return br;
			
		}
		int mid =(lo+hi)/2;
		int[]fh=mergesort(arr,lo,mid);
		int[]sh=mergesort(arr,mid+1,hi);
		int[]ans=mergeoftwoarrays(fh,sh);
		
		return ans;
		
		
		
	}

	public static int [] mergeoftwoarrays(int[]arr1,int[] arr2) {
		
		
		int[]merge= new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length) {
			
			
			if(arr1[i]<=arr2[j]) {}
			
			
			
			
			
			
			
			
		}
		
		
	
		
		
		
	}
	

}