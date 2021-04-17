package LEC24;

public class Clientbst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		Binarysearchtree bst = new Binarysearchtree(arr);
		
		//bst.display();
		//bst.replacewithsum();
       // bst.display();
        bst.printinrange(2, 6);
	}

}
