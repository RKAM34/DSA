package Practice;

public class ppppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {5,3,6,9,88,7,5,6,3};
          int [] ans=quicksort(arr, 0, arr.length-1);
		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	public static int [] mergesort(int [] arr,int lo, int hi) {
		//int lo=0;
		//int hi=arr.length;
		if(lo==hi) {
			int []ba=new int[1];
			ba[0]=arr[lo];
					return ba;
		}
		int mid=(lo+hi)/2;
		int []fmh =mergesort(arr,lo,mid);
		int []smh=mergesort(arr,mid+1,hi);
		int []ans=merge2arrays(smh, fmh);
		return ans;
		
	}

	public static int[] merge2arrays(int []arr1,int []arr2) {
		int i =0;
		int j=0;
		int k=0;
	int ans []=new int[arr1.length+arr2.length];
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				
				ans[k]=arr1[i];
				i++;
				k++;
			}else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}
	public static int[] quicksort(int arr[],int lo,int hi) {
		if(lo>=hi) {
			int []ba=new int[1];
			ba[0]=arr[lo];
					return ba;
		}
		int pivot=arr[hi];
		int pi=partition(arr, pivot);
		quicksort(arr, lo, pi-1);
		quicksort(arr, pi+1, hi);
		return arr;
	}
	public static int partition(int [] arr, int pivot) {
		
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]>pivot) {
				i++;
			}else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return (j-1);
	}
	public static void swap(int []arr,int i , int j ) {
		int temp= arr[i];
	           arr[i]=arr[j];
	           arr[j]=temp;
	}

}
