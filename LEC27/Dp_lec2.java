package LEC27;

public class Dp_lec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="abcdef";
  String s2="abcd";
  System.out.println(editdistance(s1, s2));
	}

	public static int LCS(String s1, String s2) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 == 0 || l2 == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {

			ans = LCS(ros1, ros2) + 1;
		} else {

			int fp = LCS(s1, ros2);
			int sp = LCS(ros1, s2);

			ans = Math.max(fp, sp);
		}

		return ans;

	}

	public static int LCSTD(String s1, String s2, int[][] strg) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 == 0 || l2 == 0) {
			return 0;
		}

		if (strg[l1][l2] != -1) {
			return strg[l1][l2];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {

			ans = LCSTD(ros1, ros2, strg) + 1;
		} else {

			int fp = LCSTD(s1, ros2, strg);
			int sp = LCSTD(ros1, s2, strg);

			ans = Math.max(fp, sp);
		}

		return strg[l1][l2] = ans;

	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length() || col == s2.length()) {
					strg[row][col] = 0;
					continue;
				}
				char ch1 = s1.charAt(row);
				char ch2 = s2.charAt(col);
				int ans = 0;
				if (ch1 == ch2) {

					ans = strg[row + 1][col + 1] + 1;
				} else {
					ans = Math.max(strg[row + 1][col], strg[row][col + 1]);
				}
				strg[row][col] = ans;
			}

		}

		return strg[0][0];
	}
	
public static int editdistance(String s1 , String s2) {
	if(s1.length()==0||s2.length()==0) {
		return Math.max(s1.length(), s2.length());
		
	}
	char ch1=s1.charAt(0);
	char ch2=s2.charAt(0);
	String ros1=s1.substring(1);
	String ros2=s2.substring(1);
	int ans=0;
	if(ch1==ch2) {
		ans=editdistance(ros1, ros2);
		
	}else {
		int i = editdistance(s1, ros2);
		int r = editdistance(ros1, ros2);
		int d = editdistance(ros1, s2);
		ans = Math.min(i, Math.min(r, d))+1;
		
	}
	return ans;
}
public static int EditDistanceBU(String s1, String s2) {

	int[][] strg = new int[s1.length() + 1][s2.length() + 1];

	for (int row = s1.length(); row >= 0; row--) {
		for (int col = s2.length(); col >= 0; col--) {

			if (row == s1.length()) {
				strg[row][col] = s2.length() - col;
				continue;
			}

			if (col == s2.length()) {
				strg[row][col] = s1.length() - row;
				continue;
			}

			char ch1 = s1.charAt(row);
			char ch2 = s2.charAt(col);

			int ans = 0;
			if (ch1 == ch2) {
				ans = strg[row + 1][col + 1];
			} else {

				int i = strg[row][col + 1];
				int d = strg[row + 1][col];
				int r = strg[row + 1][col + 1];

				ans = Math.min(i, Math.min(d, r)) + 1;
			}

			strg[row][col] = ans;

		}
	}

	return strg[0][0];

}
	}

