//package com.test06;
//
//import java.util.Scanner;
//
//import com.test06.biz.VendingMachineBiz;
//import com.test06.entity.Coffee;
//import com.test06.entity.Coke;
//import com.test06.entity.Drink;
//import com.test06.entity.Juice;
//
//public class VendingMachineTest {
//	private static void printMenu() {
//		System.out.println("============================");
//		System.out.println("[음료수 자판기 관리 시스템]");
//		System.out.println("============================");
//		System.out.println("1. 전체 음료수 및 잔액 보기");
//		System.out.println("2. 쥬스 구입하기");
//		System.out.println("3. 커피 구입하기");
//		System.out.println("4. 코크 구입하기");
//		System.out.println("5. 구입한 음료수 목록 보기");
//		System.out.println("9. 종료");
//		System.out.println("============================");
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		VendingMachineBiz biz = new VendingMachineBiz();
//		Drink[] drink = new Drink[3];
//		drink[0] = new Juice();
//		drink[1] = new Coffee();
//		drink[2] = new Coke();
//
//		while(true) {
//			printMenu();
//			System.out.print("메뉴 입력 => ");
//			switch(sc.nextInt()){
//				case 1: biz.printDrinkList(drink); break;
//				case 2: biz.cartDrink(drink[0]); break;
//				case 3: biz.cartDrink(drink[1]); break;
//				case 4: biz.cartDrink(drink[2]); break;
//				case 5: biz.printCart(); break;
//				case 9: System.out.println("프로그램 종료"); return;
//				default: System.out.println("메뉴값을 확인 후 다시 입력하세요"); break;
//			}
//		}
//	}
//}
