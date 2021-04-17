package LEC17;

import LEC16.Queue;

public class Dynamicqueue extends Queue {
	@Override
	public void enqueue(int item) throws Exception {

		if (isfull()) {

			int[] n = new int[data.length * 2];

			for (int i = 0; i < size; i++) {

				int idx = (front + i) % data.length;
				n[i] = data[idx];

			}
			front = 0;
			data = n;

		}
		super.enqueue(item);

	}

}
