package Practice;

public class client_queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue2 q = new queue2(10);
		q.enqueue2(1);
		q.enqueue2(1);
		q.enqueue2(1);
		q.enqueue2(1);
		q.enqueue2(1);
		q.enqueue2(1);
		//q.display();
        q.dequeue2();
       // q.display();
        q.dequeue2();
        q.display();
	}

}
