package student;

public class Student {
	
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	int sum;
	
	public int getTotal(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
		
		sum = kor + eng + math;
		return sum;
	}
	
	public double getAverage() {
		double avg = ((double)sum / 3);
		return avg;
	}
}
