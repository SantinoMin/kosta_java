package chapter11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exam11_6 {
	
	public static int getGroupCount(TreeSet<Student> ts, int from, int to) {
		SortedSet<Student> ss = ts.subSet(new Student("",0,0,from,from,from), new Student("",0,0,to,to,to));
		//System.out.println(ss);
		return ss.size();
	}
	
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getTotal()-o2.getTotal();
			}
		});
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));
		Iterator<Student> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
//이자바,1,4,70,90,70,230,76.7
//남궁성,1,2,90,70,80,240,80.0
//김자바,1,3,80,80,90,250,83.3
//홍길동,1,1,100,100,100,300,100.0
//[60~69] :0
//[70~79] :1
//[80~89] :2
//[90~100] :1
