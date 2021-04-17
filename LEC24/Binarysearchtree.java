package LEC24;

//import LEC23.Binarytree.Node;

public class Binarysearchtree {
  
	 class node {
		 int data ;
		  node left ;
		  node right ;
		 
	 }
	 private node root ;
	 public Binarysearchtree( int [] arr) {
		 
		 root = construct (arr , 0 , arr.length-1);
		 
		}
	 public node construct( int[] arr , int lo , int hi ) {
		 if(lo>hi) {
			 return null;
		 }
		 int mid = (hi + lo )/2;
		 node nn = new node();
		 nn.data=arr[mid];
		 nn.left = construct(arr,lo,mid-1);
		 nn.right=construct(arr,mid+1,hi);
		 return nn;
		 
	 }
	 public void display() {

			display(root);
		}

		public void display(node node) {

			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += ".";
			}

			str += "<-" + node.data + "->";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += ".";
			}

			System.out.println(str);

			display(node.left);
			display(node.right);

		}
		public int size(node node) {

			if (node == null) {
				return 0;
			}

			int ls = size(node.left);
			int rs = size(node.right);

			return ls + rs + 1;

		}
		public int height() {
			return height(root);
		}

		public int height(node node) {

			if (node == null) {
				return -1;
			}

			int lh = height(node.left);
			int rh = height(node.right);

			return Math.max(lh, rh) + 1;

		}
		public int max(node node) {

			if (node.right == null) {
				return node.data;
			}

			
			int rm = max(node.right);

			return rm;

		}
       public boolean find (int item) {
    	   return find(root,item);
       }
       public boolean find (node node , int item) {
    	   if (node==null) {
    		   return false ;
    	   }
    	   if(node.data==item) {
    		   return true ;
    		  
    		   
    	   }
    	   if(node.data>item) {
    		   return find(node.left,item);
    	   }
    	   else if(node.data<item) {
    		   return find(node.right,item);
    		   
    	   }
    	   else {
    		   return true;
    	   }
       }
       public void printinrange(int ll , int ul) {
    	   printinrange(root,ll,ul);
    	   
       }
       private void printinrange(node node , int ll , int ul) {
    	   if(node==null) {
    		   return;
    	   }
    	   if(node.data<ll) {
    		   printinrange(node.right,ll,ul);
    		   
    	   }else if(node.data>ul) {
    		   printinrange(node.left,ll,ul);
    		   
    	   }
    	   else {
    		   printinrange(node.left,ll,ul);
    		   System.out.print(node.data + " ");
    		   printinrange(node.right,ll,ul);
    	   }
    	   
       }
       public void replacewithsum() {
    	   replacewithsum(root);
       }
       private int sum=0;
       public void replacewithsum(node node) {
    	   if(node==null) {
    		   return;
    	   }
    	   replacewithsum(node.right);
    	   int temp = node.data;
    	   node.data=sum;
    	   sum+=temp;
    	   replacewithsum(node.left);
       }
       public void add_onelevelbefore(int val) {
    	   add_onelevelbefore(root, val);
       }
       
       public void add_onelevelbefore(node node , int val) {
    	   
    	   node nn = new node();
    	   nn.data=val;
    	   if(val<node.data&&node.left==null) {
    		   node.left=nn;
    		   return;
    		   
    	   }
    	   else if(val>node.data&&node.right==null) {
    		   node.right=nn;
    		   return;
    	   }
    	   if(node.data>val) {
    		   add_onelevelbefore(node.left,val);
    	   }
    	   else {
    		   add_onelevelbefore(node.right, val);
    	   }
    	   
       }

}
