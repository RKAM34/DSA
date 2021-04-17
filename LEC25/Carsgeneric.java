package LEC25;

public class Carsgeneric {

	 int speed ;
	 int price ;
	 String colour ;
	

public Carsgeneric(int s , int p , String c) {
	
	speed=s;
	price =p;
	colour=c;
	
}
 @Override
public String toString() {
	 return"[s:"+speed+"p:"+price+"c:"+colour+"]";
 
 }
 public int compareTo( Carsgeneric other) {
	 
	 return other.price-this.price;
	 
 }
}