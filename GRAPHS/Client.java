package GRAPHS;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Classgraph gp = new Classgraph(7);
        gp.addedge(1, 2);
        gp.addedge(1, 4);
        gp.addedge(2, 3);
        gp.addedge(3, 4);
        gp.addedge(4, 5);
        gp.addedge(5, 6);
        gp.addedge(5, 7);
        gp.addedge(6, 7);
        System.out.print(gp);

	
		
		System.out.println("*******************");
		System.out.println(gp);
		
		
		System.out.println(gp.hasPath(1, 7));
		System.out.println("All Paths");
		gp.hasAllPath(1, 7);
		
		System.out.println("BFS");
		System.out.println(gp.BFS(1, 7));
		
		System.out.println("DFS");
		System.out.println(gp.DFS(1, 7));
		
		
		System.out.println("BFT");
		gp.BFT();
	System.out.println(gp.iscyclic());	

}
}
