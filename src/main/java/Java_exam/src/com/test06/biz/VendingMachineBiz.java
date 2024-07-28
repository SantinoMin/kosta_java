//package com.test06.biz;
//
//import com.test06.entity.Coffee;
//import com.test06.entity.Coke;
//import com.test06.entity.Drink;
//import com.test06.entity.Juice;
//
//public class VendingMachineBiz implements IVendingMachineBiz {
//	private int balance = 1000; // 현재 잔액
//	private Drink[] cartList = new Drink[3]; // 구입목록 배열
//	private int count = 0; // 배열개수
//
//	@Override
//	public void cartDrink(Drink drink) {
//		if (drink instanceof Juice) {
//			drink = (Juice)drink;
//		} else if (drink instanceof Coffee) {
//			drink = (Coffee)drink;
//		} else if (drink instanceof Coke) {
//			drink = (Coke)drink;
//		}
//
//		if (balance < drink.getPrice()) {
//			System.out.println("잔액이 부족하여 " + drink.toString() + "구매 불가능합니다.");
//		} else {
//			balance -= drink.getPrice();
//			if (count >= cartList.length) {
//				Drink[] cartList2 = new Drink[cartList.length * 3];
//				System.arraycopy(cartList, 0, cartList2, 0, cartList.length);
//				cartList = cartList2;
//			}
//
//			cartList[count++] = drink;
//
//			System.out.print(drink.toString() + "를 구입했습니다.");
//			System.out.println("현재 잔액: " + balance + " 원\n");
//		}
//	}
//
//	@Override
//	public void printCart() {
//		int[] cartCount = new int[3];
//		int sum = 0;
//
//		for(int i = 0; i < count; i++) {
//			if (cartList[i] instanceof Juice) {
//				sum += cartList[i].getPrice();
//				cartCount[0]++;
//			} else if (cartList[i] instanceof Coffee) {
//				sum += cartList[i].getPrice();
//				cartCount[1]++;
//			} else if (cartList[i] instanceof Coke) {
//				sum += cartList[i].getPrice();
//				cartCount[2]++;
//			}
//		}
//
//		System.out.println("쥬스: " + cartCount[0] + "개");
//		System.out.println("커피: " + cartCount[1] + "개");
//		System.out.println("코크: " + cartCount[2] + "개");
//		System.out.println("사용 금액:" + sum + "원");
//		System.out.println("남은 금액:" + balance + "원\n");
//	}
//
//	@Override
//	public void printDrinkList(Drink[] drinkList) {
//		System.out.println("============================");
//		System.out.println("음료수명   가격");
//		System.out.println("============================");
//		for (int i = 0; i < drinkList.length; i++) {
//			System.out.println(String.format("%s %d원", drinkList[i].toString(), drinkList[i].getPrice()));
//		}
//		System.out.println("--------------------");
//		System.out.println("현재 잔액: " + balance + " 원\n");
//	}
//}
