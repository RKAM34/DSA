package Practice;

public class ll {
	
public class node {
	int val;
	node next;
	
	public node () {}
	public node (int v) {
		val=v;
		
	}
	
}
  private node head;
  private node tail;
  public  int size;
 
  public boolean isempty() {
	 return head==null; 
 }
  
  public int  getfirst() throws Exception{
	  if(isempty()) {
		  throw new Exception("linked list is empty ");
	  }
	  return head.val;
  }
  public int getlast()throws Exception {
	  if(isempty()) {
		  throw new Exception("linked list is empty");
	  }
	  return tail.val;
  }
  public void addfirst(int item) {
	  
	  node n=new node();
	  n.val=item;
	  if(isempty()) {
		  head=n;
		  tail=n;
		  size++;
	  }
	  else {
		  n.next=head;
		   head=n;
		   size++;
	  }
  }
  public void addlast(int item) {
	  node n =new node();
	  n.val=item;
	  if(isempty()) {
		  head=n;
		  tail=n;
		  size++;
	  }
	  else {
		  n.next=tail;
		  tail=n;
		  size++;
	  }
  }
 
public void display() {
	node temp;
	temp=head;
	System.out.println("*-*-*-*-*-*-*-*-*-*-*");
	while(temp!=null) {
		System.out.print(" "+temp.val);
		temp=temp.next;
	}
	System.out.println();
	System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
	
}

public int getat(int idx) throws Exception {
	if(idx<0||idx>size) {
		throw new Exception("given index is invalid");
	}
	if(isempty()) {
		throw new Exception("list is empty");
	}
	node temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	
	
	
	
	return temp.val;
}


public node getnodeat(int idx) throws Exception {
	if(idx<0||idx>size) {
		throw new Exception("given index is invalid");
	}
	if(isempty()) {
		throw new Exception("list is empty");
	}
	node temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	
	
	
	
	return temp;
}
public void addat(int item,int idx) throws Exception {
	if(idx==0) {
		addfirst(item);
	}
	else if(idx==size-1) {
		addlast(item);
	}
	
	else {
		node nn= new node();
        nn.val=item;
        
        node p =getnodeat(idx-1);
        node c=p.next;
        
        p.next=nn;
        nn.next=c;
        size++;
	}
	
}

































}
