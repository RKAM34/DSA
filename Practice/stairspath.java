package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class stairspath {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n =scn.nextInt();
        ArrayList<String> paths = getstairpath(n);
        System.out.println(paths);
	}
	
	
	public static ArrayList<String> getstairpath(int n){
		if(n==0) {
			ArrayList<String> bres = new ArrayList<String>();
		bres.add(" ");	
		return bres;
		}
		else if (n<0) {
		ArrayList<String> bres = new ArrayList<String>();
		return bres;
		}

		
	ArrayList<String> path1 =	getstairpath(n-1);
	ArrayList<String> path2=getstairpath(n-2);
	ArrayList<String> path3	=getstairpath(n-3);
		ArrayList<String> paths= new ArrayList<String>();
		for(String Path : path1) {
			paths.add(1+Path);
		}
			
		for(String Path : path2) {
			paths.add(2+Path);
		}
		for(String Path : path3) {
			paths.add(3+Path);
		}
		
		return paths;
	}

	
}
