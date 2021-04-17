package lec6;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= { 10 ,20 ,50 ,90 ,60};
		selsort(arr);
		 for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}

	}
public static void selsort(int[] arr)
{   for(int cnt=0;cnt<=arr.length-2;cnt++) {
	 int min = cnt;
	 for(int j=cnt+1;j<arr.length;j++) {
		if(arr[j]<arr[min]) {
			min=j;
		}  
	 }
	 int temp=arr[cnt];
	 arr[cnt]=arr[min];
	 arr[min]=temp;

}  
  
 	}
}
