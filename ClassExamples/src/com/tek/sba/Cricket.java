package com.tek.sba;

import java.util.Arrays;

public class Cricket {
	private int[] playerIDs;
	Cricket(){
		playerIDs = new int[12];
		for(int i=1; i<playerIDs.length; i++) {
			playerIDs[i] = 1;
		}
		System.out.println("A new cricket team has been formed");
		System.out.println(Arrays.toString(playerIDs));
	}

}
