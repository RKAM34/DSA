package LEC16;

public class Queue {
	
    protected	int [] data;
	protected int front;
	public  int size;
	
	


 public Queue() {
  data=new int [5];
  front = 0;
  size = 0;
  
	 
	}
 public Queue(int cap) {
	 data = new int [cap];
	 front = 0 ;
	 size = 0 ;
	 
 }
	 public void enqueue(int item) throws Exception {
		 if(isfull()) {
			 
			 throw new Exception("queue is full");
			 
		 }
		 
		 
		 data[(front + size)%data.length] = item ;
		 size++;
		 
		 
		 
	 }
	 public boolean isfull() {
		 
		 return data.length==size;
		 
	 }
	 public boolean isempty() {
		 
		 return size==0;
	 }
	 public int dequeue() throws Exception {
		if(isempty()) {
			
			throw new Exception("queue is empty");
		}
		 int temp = data[front];
		 data[front]=0;
		 
		 front++;
		 front = front%data.length;
		 size--;
	 return temp;
	 }
	 public int getfront() {
		 
		 int temp = data[front];
		 return temp;
		 
		 
		 
	 }
	 public void display() {
		 
		 for(int i= front ; i<front + size ; i++) {
			 
			 System.out.println(data[i%data.length]  + "");
		 }
	 }
 }

