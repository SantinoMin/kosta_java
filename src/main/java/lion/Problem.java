//package lion;
//
////다음은 JAVA 코드 문제이다.
////가지고 있는 돈이 총 4620원일 경우
////1000원, 500원, 100원, 10원의 지폐 및 동전을 이용하여 보기의 조건에
////맞춰 최소한의 코드를 통해 괄호안을 작성하시오.
//dd
////변수 : m
////연산자 : / , %
////괄호 : [ , ] , ( , )
////정수 : 1000, 500, 100, 10
//
//public class Problem {
//
//  public static void main(String[] args) {
//    int a,b,c,d,m;
//    m = 4620;
//
//    a = (m / 1000); // 천원짜리 4장 -- 4.62 --> 몫: 4
//    System.out.println("m - a = " + (m-a));
//
//    b = ( m - a  / 500); // 500짜리 1개 //
//    System.out.println(b);
//    c = (b / 100); // 100원 1개
//    d = (c / 10); // 10원 2개
//
//    System.out.println(a);
//    System.out.println(Math.round(b));
//    System.out.println(Math.round(c));
//    System.out.println(Math.round(d));
//  }
//}

//m = 4650
//
//a = (m/1000) = 4 -- 4가 나와야 함
//    b = m-(a*1000)/500 = 1  //
//c = m-(a*1000+b*500) = 4650 - (4000 + 500) = 150
//    -- (m-(a*1000+b*500))/100 = 1
//d = (m-(a*1000+b*500+c*100))/10 = 5
