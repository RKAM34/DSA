package Practice;

public class next_greater {
	
	static class stack{
		
		int top;
		int []items= new int[100];
	
		void push(int x) {
			
			if(top==99) {
				System.out.println("stack is full");
				
			}
			else {
				items[++top]=x;
				
			}
			
		}
		
		int pop(){
			
			if(top==-1) {
				System.out.println("stack underflow error");
				return -1;
			}
			
			else  {
					int element =items[top];
					top--;
					return element;
					
		}
		}
		
		boolean isempty() {
		return (top==-1)?true:false; 
		}
		
		
		
		
		
		
	}
	
	public static void nge(int arr[], int n) {
		
		int i=0;
		stack s=new stack();
		s.top=-1;
		
		int element , next;
		s.push(arr[0]);
		
		for( i=1;i<n;i++) {
			
		next=arr[i];
		
		
		if(s.isempty()==false) {
			
			element=s.pop();
			
			while(element<next) {
				
				
				System.out.println(element+"---->"+next);
				
				if(s.isempty()==true) {
					break;
					
				}
				element = s.pop();
				
			}
			
			if(element>next) {
				
				
		s.push(element);		
		
			}
			
			
		}
			
			s.push(next);
			
			
			
		}
		
		
		
while(s.isempty()==false) {
			
			element=s.pop();
			next=-1;
			System.out.println(element+"--->"+next);
		}
			
		
	} 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = { 7,8,1,4 }; 
        int n = arr.length; 
        nge(arr, n);
     
     
	}

}
