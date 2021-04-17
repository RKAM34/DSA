package LEC16;

public class Client_queue {

	public static void main(String[] args) throws Exception {
		
		
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.display();
		
		System.out.println(q.dequeue());
		
		q.dequeue();
		System.out.println();
		q.display();
		

	}

}
