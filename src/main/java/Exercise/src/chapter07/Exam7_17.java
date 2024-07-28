//package chapter07;
//
//class Unit {
//	int x, y; // 현재 위치
//	void move(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
//	void stop() {
//		System.out.println("현재 위치에 정지");
//	}
//
//}
//class Marine extends Unit { // 보병
//	@Override
//	void move(int x, int y) {
//		super.move(x, y);
//		System.out.println(String.format("(%d,%d)로 걸어서 이동", x,y));
//	}
//	void stimPack() {
//		System.out.println("스팀팩을 사용한다.");
//	}
//}
//
//class Tank extends Unit { // 탱크
//	void changeMode() {
//		System.out.println("공격모드를 변환한다");
//	}
//	@Override
//	void move(int x, int y) {
//		System.out.println(String.format("(%d,%d)로 굴러서 이동", x,y));
//	}
//}
//
//class Dropship extends Unit { // 수송선
//	int x, y; // 현재 위치
//	void load() {
//		System.out.println("선택된 대상을 태운다.");
//	}
//	void unload() {
//		System.out.println("선택된 대상을 내린다.");
//	}
//	@Override
//	void move(int x, int y) {
//		System.out.println(String.format("(%d,%d)로 떠서 이동", x,y));
//	}
//}
//
//public class Exam7_17 {
//
//	public static void changeMod(Unit[] unit) {
//		for(int i=0; i<unit.length; i++) {
//			if(unit[i] instanceof Tank == true) {  //Unit 배열에서 Tank 객체만 걸러낸다
////				Tank tank = (Tank)unit[i];
////				tank.changeMode();
//				((Tank)unit[i]).changeMode();
//			}
//		}
//	}
//
//	public static void stimPack(Unit[] unit) {
//		for(int i=0; i<unit.length; i++) {
//			if(unit[i] instanceof Marine) {
//				((Marine)unit[i]).stimPack();
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Unit[] unit = new Unit[4];
//
//		unit[0] = new Marine();
//		unit[1] = new Tank();
//		unit[2] = new Dropship();
//		unit[3] = new Marine();
//
//		for(int i=0; i<unit.length; i++) {
//			unit[i].move(10, 10);
//		}
//
//		changeMod(unit);
//		stimPack(unit);
//	}
//}
