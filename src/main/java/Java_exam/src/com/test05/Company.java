//package com.test05;
//
//import java.util.HashMap;
//
//public class Company {
//	public static void main(String[] args) {
//		HashMap<Integer, Employee> map = new HashMap<>();
//
//		map.put(1, new Secretary("홍길동", 1, "Secretary", 800));
//		map.put(2, new Sales("이순신", 2, "Sales", 1200));
//
//		System.out.println("name   department   salary");
//		System.out.println("------------------------------------------");
//
//		for (Integer key : map.keySet()) {
//			Employee emp = map.get(key);
//			System.out.println(emp.toString());
//			if (map.get(key) instanceof Secretary) ((Secretary)emp).incentive(100);
//			else ((Sales)emp).incentive(100);
//		}
//
//		System.out.println("\n인센티브100지급\n");
//
//		System.out.println("name   department   salary    tax");
//		System.out.println("------------------------------------------");
//
//		for (Integer key : map.keySet()) {
//			System.out.println(map.get(key).toString() + "   "+ map.get(key).tax());
//		}
//	}
//}
