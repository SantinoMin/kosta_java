package chapter06;

public class Student {
	String name;// 학생이름
	int ban; // 반
	int no;// 번호
	int kor;// 국어점수
	int eng;// 영어점수
	int math;// 수학점수
	
	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		float avg = getTotal()/3f;
		return Math.round(avg*10)/10f;
	}
	
	String info() {
		return String.format("%s,%d,%d,%d,%d,%d,%d,%.1f", 
				name,ban,no,kor,eng,math,getTotal(), getAverage());
	}
}
