package LEC16;

public class Client_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Stack s = new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		 s.push(40);
		 s.push(50);
         s.display();
         System.out.println("the popped  item is" + s.pop());
         s.display();
	}

}
