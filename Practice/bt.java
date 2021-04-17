package Practice;

import java.util.Stack;

public class bt {

	public static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data, Node left , Node right){
			
			
			this.data=data;
			this.left=left;
			this.right=right;
			
		}
		
	}
	
	public static class pair{
		
		Node node;
		int state;
		
		pair(Node node, int state){
			
			this.node=node;
			this.state=state;
		}
		
		
	}
	public static void display(Node node) {
		if(node==null) {
			return;
		}
		String str = "";
		str+= node.left==null? "." : node.left.data+" ";
		str+= "<-"+node.data+"->";
		str+=node.right==null?"." : node.right.data+" ";
		
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = {20,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		int idx=0;
         Node rtn= new Node(arr[0], null, null);
         pair rtp=new pair(rtn, 1);
         Stack <pair> st = new Stack<>();
         st.push(rtp);
         while(st.size()>0) {
        	 
        	 pair top =st.peek();
        	 if(top.state==1) {
        		 idx++;
        		 if(arr[idx]!=null) {
        			 
        			 Node ln= new Node(arr[idx], null, null) ;
        			 top.node.left=ln;
        			 pair lnp = new pair(ln, 1);
        			 st.push(lnp);
        		 }
        		 else {
        			 top.node.left=null;
        		 }
        		 top.state++;
        		 
        	 }else if(top.state==2) {
        		 idx++;
        		 if(arr[idx]!=null) {
        			 
        			 Node rn= new Node(arr[idx], null, null) ;
        			 top.node.right=rn;
        			 pair rnp = new pair(rn, 1);
        			 st.push(rnp);
        		 }
        		 else {
        			 top.node.right=null;
        		 }
        		 top.state++;
        	 }
        	 else {
        		 st.pop();
        	 }
        	 
        	 
         }
         
         display(rtn);
         
	}

}
