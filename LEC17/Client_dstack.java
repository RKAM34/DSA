package LEC17;

import LEC16.Stack;

public class Client_dstack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack s = new Dynamicstack();
		s.push(1);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(88);

		s.display();
		System.out.println("the reversed array is ");
		displayreverse(s);
		System.out.println("*****************************");
		actualreverse_1(s, new Dynamicstack());
		System.out.println("actual reverse stack");
		s.display();

		int arr[] = { 10, 20, 4, 5, 6, 7, 20, 2 };
		stockspan(arr);

	}

	public static void displayreverse(Stack s) throws Exception {
		if (s.isempty()) {

			return;
		}
		int temp = s.pop();
		displayreverse(s);
		System.out.println(temp);
		s.push(temp);

	}

	public static void actualreverse_1(Stack s, Stack h) throws Exception {
		if (s.isempty()) {

			actualreverse(s, h);
			return;

		}
		h.push(s.pop());
		actualreverse_1(s, h);

	}

	public static void actualreverse(Stack s, Stack h) throws Exception {
		if (h.isempty()) {

			return;

		}
		int temp = h.pop();
		actualreverse(s, h);
		s.push(temp);

	}

	public static void stockspan(int[] arr) throws Exception {
		Stack s = new Dynamicstack();
		int[] res = new int[arr.length];

		s.push(0);
		res[0]=1;
		

		for (int i = 1; i < arr.length; i++) {

			while (!s.isempty() && arr[i] > arr[s.peek()]) {
				s.pop();
			}

			if (s.isempty()) {

				res[i] = i + 1;

			} else {

				res[i] = i - s.peek();
			}
			
			s.push(i);

		}
		
		for(int val:res)
			System.out.print(val+" ");

	}
}
