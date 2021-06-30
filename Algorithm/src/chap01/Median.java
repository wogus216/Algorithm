package chap01;

import java.util.Scanner;

public class Median {

	static int med3(int a, int b, int c) {
		
		if(a >= b) { //a가 b보다 크거나 같은 경우
			if( b >= c) { //a가 b보다 크거나 같고, b가 c보다 작거나 같은 경우
				return b;
		   }else if( a <= c) { // a가 b보다 크거나 같고  a가 c보다 작거나 같은 경우
			  return a ;
		   }else { // a가 b보다 크거나 같고, c가 a보다 작고, b보다 큰 경우
			   return c;
		   }
		}else if( a > c) { //a가 b보다 작거나 같고, c보다는 큰경우
			return a;
		}else if( b > c) { //a가 b보다 작거나 같고, c가 a랑 같거나, 큼
			return c;
		}else { // //a가 b보다 작거나 같고, ,a가 c보다 작거나 같고, b가 c보다 작거나 같다.
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세정수의 중앙값을 구합니다.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("a의값 : "+ a);
		System.out.println("b의값 : "+ b);
		System.out.println("c의값 : "+ c);
		
		System.out.println("중앙값 : "+med3(a, b, c));
	}

}
