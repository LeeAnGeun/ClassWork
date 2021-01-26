package main;

import TV.MyYn2;
import dice.Game;
import student.Student;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "홍길이";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal(s.kor,s.eng,s.math));
		System.out.println("이름:" + s.getAverage());
		
		MyYn2 t = new MyYn2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		
		
		Game g = new Game();
		
		g.game();
		g.resultPrint();
	}

}
