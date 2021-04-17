package lec6;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= { 10 ,20 ,50 ,90 ,60};
		inssort(arr);
		 for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}

	}
public static void inssort(int[] arr) {
	for(int cnt=1;cnt<=arr.length-1;cnt++) {
		int temp=arr[cnt];
		int j=cnt-1;
		while(j>=0&&temp<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		 arr[j+1]=temp;
	}
   }
 }
