package chap05;

import java.util.Scanner;

//유클리드 호제법으로 최대공약수 구하기
public class EuclidGCD {
	// 정수 x ,y의 최대공약수를 구하여 반환합니다.
	static int gcd(int x, int y ) {
		if(y==0) {
			return x;
		} else {
			return gcd(y, x %y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 굽합니다.");
		
		System.out.print("정수를 입력하세요. :"); 
		int x = sc.nextInt();
		System.out.print("정수를 입력하세요. :"); 
		int y = sc.nextInt();
		
		System.out.println("최대 공약수는 "+ gcd(x,y)+"입니다.");
		
	}
}
