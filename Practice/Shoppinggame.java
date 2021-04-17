package Practice;

import java.util.Scanner;

public class Shoppinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int prev=scn.nextInt();
boolean isinrc=true;
for(int i=1;i<n;i++) {
	int curr=scn.nextInt();
	if(prev<curr) {
		isinrc=true;
	}else if(prev>curr&&isinrc) {
		isvalid=false;
		break;
	}
	else if(prev==curr) {
		isvalid=false;
		break;
	}
}
	}

}
