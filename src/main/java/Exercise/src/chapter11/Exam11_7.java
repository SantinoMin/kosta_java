package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class BanNoAscending implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
//		if(o1.ban>o2.ban) {
//			return 1;
//		} else if(o1.ban<o2.ban) {
//			return -1;
//		} else {
//			return o1.no-o2.no;
//		}
		
		return (o1.ban-o2.ban!=0)? o1.ban-o2.ban: o1.no-o2.no;
	}
}

public class Exam11_7 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		Collections.sort(list, new BanNoAscending());
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
