package LEC17;


public class Clientdqueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
                   
          Dynamicqueue q = new Dynamicqueue();
          
          q.enqueue(10);
          q.enqueue(2);
          q.enqueue(20);
          q.enqueue(55);
          q.enqueue(66);
          q.enqueue(88);
          q.display();
		System.out.println("****************************************");
		reversedisplay(q, 0);
	}
   public static void actualreverse(Dynamicqueue q ) throws Exception{
	   if(q.isempty()) {
		   
		   
		   
		   return;
	   }
	   int temp = q.dequeue();
	   actualreverse(q);
	   System.out.println(temp);
	   q.enqueue(temp);
	   

   
	   
	   
	   
   }
   public static void reversedisplay ( Dynamicqueue q , int count) throws Exception {
	   if(count==q.size) {
		   
		  return; 
		   
		   
	   }
	   int temp = q.dequeue();
	   	   q.enqueue(temp);
	
	   reversedisplay(q,count+1);
	   System.out.println(temp);

	 
	   
	   
   }
   
}

