package SEGMENTtree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 4, 5, 1, 2 };
		Segmenttree st = new Segmenttree(arr);
		//st.display();
		System.out.println(st.query(3, 6));
	}

}
