package test;

import java.util.ArrayList;

public class ArrayDiff {

	public static int[] diff(int[] a, int[] b) {
		ArrayList<Integer> ary = new ArrayList<Integer>();
		for(int vx: a) {
			boolean isF = false;
			for(int vy: b) {
				if (vx == vy) {
					isF = true;
					break;
				}
			}
			if (!isF) {
				ary.add(vx);
			}
		}
		int nw[] = new int[ary.size()];
		for (int i = 0; i < ary.size(); i++) {
			nw[i] = ary.get(i);
		}
		return nw;
	}
	
}
