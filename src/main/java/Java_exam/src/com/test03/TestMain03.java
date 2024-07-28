//package com.test03;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class TestMain03 {
//	public static void main(String[] args) {
//		String str = "1.22,4.12,5.93,8.71,9.34";
//		StringTokenizer st = new StringTokenizer(str, ",");
//		List<String> al = new ArrayList<>();
//
//		while (st.hasMoreElements()) al.add(st.nextToken());
//
//		double sum = 0;
//		double count = 0;
//		double avag = 0;
//
//		for(String s : al) {
//			sum += Double.parseDouble(s);
//			count++;
//		}
//		sum = Math.round(sum * 10000) / 10000.0;
//		avag = sum / count;
//
//		System.out.println("합계: " + sum);
//		System.out.println("평균: " + avag);
//	}
//}
