package main;

import TV.MyYn2;

public class TvSet {

	public static void main(String[] args) {
		
		MyYn2 t = new MyYn2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
