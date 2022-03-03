package test;

public class Persistence {
	
	public static int persistence(long num) {
		int numRound = 0;
		while (num >= 10) {
			num = determineNewDigi(num);
			numRound ++;
		}
		return numRound;
	}
	
	private static long determineNewDigi(long num) {
		long nwNum = 0;
		String csDigts[] = (num + "").split("");
		for(String c: csDigts) {
			if (nwNum == 0) {
				nwNum = Long.parseLong(c);
			} else {
				nwNum *= Long.parseLong(c);
			}
		}
		return nwNum;
	}
	
}
