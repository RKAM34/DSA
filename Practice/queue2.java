package Practice;

public class queue2 {
	protected int [] data;
	protected int front ;
	int rear;
	
	public queue2() {
		data=new int[5];
		front=0;
		rear=0;
	}
	
	public queue2(int cap) {
		data=new int[cap];
		front=0;
		rear=0;
	}
	
	public void enqueue2(int item) {
		data[rear]=item;
		rear++;
		
	}
	public int dequeue2() {
		int temp=data[front];
		data[front]=0;
		front++;
		rear--;
		
		return temp;
		
	}
	public int getfront() {
		int temp=data[front];
		return temp;
	}
 public void display() {
	 for(int i=front;i<front+rear;i++) {
		 System.out.print(" "+data[i%data.length]);
	 }
 }
}
