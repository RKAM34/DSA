package LEC18;

public class  Linkedlist {
	
	
	public class node{
		
		int val;
		node next;
		
		public node() {
			// TODO Auto-generated constructor stub
		}
		
		public node(int v) {
			// TODO Auto-generated constructor stub
		val=v;
		}
		
		}
	
	private node head;
	private node tail;
	public int size;
	

	public boolean isempty(){
		
		
		return head==null;
		
		
	}
	
	public int getfirst() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
		}
		
		return head.val;
		
	}
	
	public int getlast() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
			
			
		}
		
		return tail.val;
		
		
		
		
		
	}
	
	public void addlast(int item) {
		
		node nn = new node();
		nn.val=item;
		
		if(isempty()) {
			
			head=nn;
			tail=nn;
			size++;
			
		}
		
		else {
			
			tail.next=nn;
			tail=nn;
			size++;
			
			
			
			
		}
		
		
		
		
	}
	
	public void addfirst(int item) {
		
		node nn = new node();
		nn.val=item;
		
		if(isempty()) {
			
			head=nn;
			tail=nn;
			size++;
			
			
		}
		else {
			
			nn.next=head;
			head=nn;
			size++;
		}
		
	}
	public void display() {
		
		
		node temp = head ;
		System.out.println("**************************");
		while(temp!=null) {
			
			
			System.out.print(" "+temp.val);
			temp=temp.next;
			
		}
		System.out.println();
		System.out.println("**************************");
		
		
		
		
		
		
		
		
	}
	
	public int getat(int idx) throws Exception{
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
				
		}
		if(idx<0||idx>=size) {
			
			
			throw new Exception("invalid index");
			
		}
		
		node temp = head ;
		
		for(int i = 0 ; i < idx ; i++) {
			
			temp=temp.next;
			
			
		}
		
		return temp.val;
		
		
		
		
		
		
		
		
	}
	
	
	public node getnodeat(int idx) throws Exception{
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
				
		}
		if(idx<0||idx>=size) {
			
			
			throw new Exception("invalid index");
			
		}
		
		node temp = head ;
		
		for(int i = 0 ; i < idx ; i++) {
			
			temp=temp.next;
			
			
		}
		
		return temp;
		
	
		
	}
	
	
	
	public void addat (int item , int idx) throws Exception {
		
		if(idx==0) {
			addfirst(item);
		}
		else if(idx==size-1){
			addlast(item);
			
		}
		else {
			
			node nn = new node();
			nn.val=item;
			
			node pnode=getnodeat(idx-1);
			
			node cnode=pnode.next;
			
			pnode.next=nn;
			nn.next=cnode;
			
			
			
			
			size++;
		
			
		}
	}
	
	public int removefirst() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
			
		}
		
	int temp = head.val;
		
		if(size==1) {
			
			head=null;
			tail=null;
			size=0;
		}
		else {
			
			
			head=head.next;
			size--;
			
			
		}
		return temp;
		
		
		
		
	}

public int removelast() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
			
		}
		
	int temp = head.val;
		
		if(size==1) {
			
			head=null;
			tail=null;
			size=0;
		}
		else {
			
			
			
			node pnode = getnodeat(size-2);
			pnode.next=null;
			tail=pnode;
			size--;
			
			
		}
		return temp;
		
		
		
		
	}

public void reversell() throws Exception{
         int i = 0;
         int j = size - 1 ;
       
         while(i<j) {
        	 
        	node ith = getnodeat(i);
        	node jth = getnodeat(size-1);
        	int temp = ith.val;
        	ith.val = jth.val;
        	jth.val = temp;
        	i++;
        	j--;
         }
       	
}
public void rpi()  //reverse pointer iteratively 
                 {
	
	
	      node prev = head;
	      node current = head.next;
	      
	      while(current!=null) {
	    	  
	    	  node save = current.next;
	    	  current.next = prev ;
	    	  prev = current  ;
	    	  current = save ;
	    	  
	    	  
	      }
	      node temp = head ;
	      head = tail ;
	      tail = temp ;
	      head = null;
	
}

    public void RPR() {
    	
    	
    	RPR(head, head.next);
    	  node temp = head ;
    	  head = tail ;
    	  tail = temp ;
    	  head = null;
    	
    }
   public void RPR(node prev , node current) {
	   
	   
	   if(current == null) {
		   
		   return ;
	   }
	   
	   RPR(current,current.next);
	   current.next = prev ;
	
   }

   
   public int  mid () //by tortoise hare approach  (speed is twiced ) 
   {
	   node a = head ; 
	   node b = head ;
	   while(b.next!=null&&b.next.next!=null) {
		   a=a.next;
		   b=b.next.next;
		   
	   }
	   return a.val;
   }
   
   public int kfromlast( int k ) // by speed is k times or we place k distance between a and b
   {
	   node a = head ;
	   node b = head ;
	   for(int i=1;i<=k;i++) {
		   b=b.next;
	   }
	   
	   a = a.next;
	   b = b.next;
	   
	   return a.val;
   }
   public void createDummyList() {
       node n1 = new node(10);
       node n2 = new node(20);
       node n3 = new node(30);
       node n4 = new node(40);
       node n5 = new node(50);
       node n6 = new node(60);
       node n7 = new node(70);
       node n8 = new node(80);
       node n9 = new node(90);
       node n10 = new node(100);
       n1.next = n2;
       n2.next = n3;
       n3.next = n4;
       n4.next = n5;
       n5.next = n6;                                     
       n6.next = n7;
       n7.next = n8;
       n8.next = null;
       n9.next = n10;
       n10.next = n7;
       node head1 = n1;
       node head2 = n9;
   }



public int intersection (node h1 , node h2) {
	
	
	
	node f1 = h1 ;
	node f2 = h2 ;
	while(f1!=f2) {
		
		f1 =  (f1== null) ?  h2 :  f1.next; 
		f2 = (f2==null) ? h1 : f2.next;
		

		
	}
	return f1.val;
}
    


}

