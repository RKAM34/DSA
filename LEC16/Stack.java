package LEC16;

public class Stack {
 
	protected int[] data;
	 int tos; //top of stack
	
	 public Stack() {
		 
		 this.tos=-1;
		 this.data=new int[5];
		 
		 
	 }
	 public Stack(int cap) {
		 
		 this.tos=-1;
		 this.data= new int[cap];
		 
	 }
	 
	 public void push(int item) throws Exception {
		 if(isfull()) {
			  throw new  Exception("stack is full");
			 
		 }
		 this.tos++;
		 data[tos]=item;
		 
		 
	 }
	 
	 public int pop() throws Exception{
		 if(isempty()) {
			 throw new Exception("stack is empty");
			 
		 }
		 
		 int temp=data[tos];
		 data[tos]=0;
		 tos--;
		 return temp;
		 
	 }
	 
	 public int peek() {
		 
		 return data[tos];
		  
		 
	 }
	 
	 public int size() {
		 
		 return this.tos+1;
		 
	
	 }
	 public boolean isempty() {
		 
		 return tos==-1;
		 
	 }
	 public void display() {
		 
		 for (int i = tos ; i>=0;i--) {
			 
			 System.out.println(data[i]);
		 }
		 
	 }
	 public boolean isfull() {
		 if(tos==data.length-1) {return true;
		 }
		 else
		 {
			 return false;
		 }
		 
		 
	 }
	 
}
