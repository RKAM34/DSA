package LEC25;

import LEC18.Linkedlist.node;

public  class  Linkedlistgeneric <T> {
 class  node{
		
		T val;
		node next;
		
		public node() {
			// TODO Auto-generated constructor stub
		}
		
		public node(T v) {
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
	
	public T getfirst() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
		}
		
		return head.val;
		
	}
	
	public T getlast() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
			
			
		}
		
		return tail.val;
		
		
		
		
		
	}
	
	public T addlast(T item) {
		
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
		return item;
		
		
		
		
	}
	
	public void addfirst(T item) {
		
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
	
	public T getat(int idx) throws Exception{
		
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
	
	
	
	public void addat (T item , int idx) throws Exception {
		
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
	
	public T removefirst() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
			
		}
		
	T temp = head.val;
		
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

public T removelast() throws Exception {
		
		
		if(isempty()) {
			
			throw new Exception("linked list is empty");
			
		}
		
	T temp = head.val;
		
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
        	T temp = ith.val;
        	ith.val = jth.val;
        	jth.val = temp;
        	i++;
        	j--;
         }
       	
}

}
