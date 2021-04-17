package SEGMENTtree;

public class Segmenttree {
	class Node {
		int data;
		int si;
		int ei;
		Node left;
		Node right;
//		public  Operations opt;
	}
//
	private Node root;

	public Segmenttree(int arr[]) {
		root = construct(arr, 0, arr.length - 1);
	}

	public Node construct(int[] arr, int lo, int hi) {
		Node nn = new Node();
		if (lo == hi) {
			nn.data = arr[lo];
			nn.si = lo;
			nn.ei = hi;
			return nn;
		}

		int mid = (lo + hi) / 2;
		Node l = construct(arr, lo, mid);
		Node r = construct(arr, mid + 1, hi);
		nn.left = l;
		nn.right = r;
		nn.data = l.data + r.data;
		nn.si = lo;
		nn.ei = hi;
		return nn;
	}

	public int query1(int qsi, int qei) {
		return query1(root, qsi, qei);
	}

	public int query1(Node node, int qsi, int qei) {
		if (node.ei < qsi || node.si > qei) {
			return 0;
		} else if (node.si >= qsi && node.ei <= qei) {
			return node.data;

		} else {
			int ls = query1(node.left, qsi, qei);
			int rs = query1(node.right, qsi, qei);
			return ls + rs;
		}
	}

	public void display() {

		display(root);

	}

	public void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}

		str += "<-" + node.data + "->";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}



	

	public int query(int qsi, int qei) {
		return query(root, qsi, qei);
	}

	public int query(Node node, int qsi, int qei) {

		if (node.ei < qsi || node.si > qei) {
			return opt.defaultVal();
		} else if (node.si >= qsi && node.ei <= qei) {
			return node.data;
		} else {

			int ls = query(node.left, qsi, qei);
			int rs = query(node.right, qsi, qei);

			return opt.operation(ls, rs);
		}

	}

	public void update(int idx, int val) {

		update(root, idx, val);
	}

	public void update(Node node, int idx, int val) {

		if (node.si == idx && node.ei == idx) {
			node.data = val;
			return;
		}

		if (node.si <= idx && node.ei >= idx) {

			update(node.left, idx, val);
			update(node.right, idx, val);

			node.data = operation(node.left.data,node.right.data);
		}

	}

}
