package Practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class gt {

 
	private static class node{
		
		int data;
		ArrayList<node> children= new ArrayList<>();	
		
	} 
	public static int size(node node) {
		int size= 0;
		for(node child: node.children) {
			
			int cs=size(child);
			size=size+cs;
		}
		size+=1;
		//System.out.println(size);
		return size;
		
	}
	public static void display(node node) {
		
		String str = node.data + "-->";
		for( node child : node.children) {
			
			str+=child.data+" , ";
			
		}
		str+=" .";
		System.out.println(str);
		for( node child : node.children){
			
			display(child);
		}
		
	}
	
	public static int max(node node) {
		int max=node.data;
		for(node child : node.children) {
			
			if(max(child)>max) {
			max=max(child);
			}
			if(child.data>max) {
				max=child.data;
			}
			
		}
		return max;
	}
	
	
	public static void levelorderzz(node node) {
		
		Stack<node> ms = new Stack<>();
		ms.push(node);
		Stack<node> cs = new Stack<>();
		int level=1;
		while(ms.size()>0) {
			node =ms.pop();
			System.out.print(node.data+" ");
			if(level%2==1) {
				
				for(int i=0;i<node.children.size();i++) {
					
					node child=node.children.get(i);
					cs.push(child);
					
				}
				
			}
			else {
				
				
				for(int i=node.children.size()-1;i>0;i--) {
					
					node child=node.children.get(i);
					cs.push(child);
					
				}
				
				
			}
			
			
			if(ms.size()==0) {
				
				ms=cs;
				cs=new Stack<>();
				level++;
				System.out.println();
				
			}
			
			
			
		}
		
		
	}
	public static void levelorder(node node) {
		
				Queue<node> q = new ArrayDeque<>();
				q.add(node);
				
				while(q.size()>0) {
			
					node=q.remove();
	
					System.out.print(node.data+" ");
	
					for(node child : node.children) {
				   
						q.add(child);
				}
				
				}
		System.out.println(".");
		
	}
	public static int height(node node) {
		
		int h=-1;
		for(node child:node.children) {
			int ch=height(child);
			h=Math.max(ch, h);
			
		}
		h+=1;
		return h;
	}
	public static void main(String[] args) {

		
		int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		
		node root=null;
		Stack<node> st= new Stack<>();
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==-1) {
				st.pop();
			}
			else {
				node t=new node();
				t.data=arr[i];
				if(st.size()>0) {
				//node t=new node();
				
				st.peek().children.add(t);
				}
				else {
					
				root=t;
				}
			
				st.push(t);
			}
		}
		
		//display(root);
	//	System.out.println("Size = "+size(root));
		//System.out.println("max = "+max(root));
		//System.out.println("height = "+height(root));
	//	levelorder(root);
levelorderzz(root);		
	}

}
