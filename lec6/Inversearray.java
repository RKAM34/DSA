package lec6;

public class Inversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,3,1,0 };
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[arr[i]]=i;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
