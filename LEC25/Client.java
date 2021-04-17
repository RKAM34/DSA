package LEC25;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Integer[] arr = {1,2,3,4};
         String [] arr2 = {"abcd","efgh","hjue"};
        
         Carsgeneric[] cars = new Carsgeneric[5];

         cars[0]=new Carsgeneric(10,20,"black");
         cars[1]=new Carsgeneric(20,220,"red");
         cars[2]=new Carsgeneric(50,250,"pink");
         cars[3]=new Carsgeneric(2,206,"yellow");
         cars[4]=new Carsgeneric(60,2033,"black");
	}
	
	public static <T> void display (T[] arr) {
      for(T val : arr) {
	System.out.println(val);
	}
      System.out.println("***************************************************");
}
	public static <T extends Comparable<T>> void sort(T[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) 
		{
			if(arr[j].compareTo(arr[j+1])>0) {	
				T temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;}
				
			}
		}
	}

}
