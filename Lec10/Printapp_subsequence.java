package Lec10;

public class Printapp_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		subseq(str, "  ");
	}

	public static void subseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		subseq(ros, ans);
		subseq(ros, ans + ch);
	//	subseq(ros, ans + (int)ch);
	}
}
