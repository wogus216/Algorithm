package chap02;

import java.util.Scanner;

public class ReverseArray {
	// 배열요소 a[idx1]과 a[idx2]의 값을 바꿈
	
	static void swap(int[]a, int idx1, int idx2) {
		int tmp = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2]= tmp;
	}
	
	//배열의 a 요소를 역순으로 정렬
	static void reverse(int[] a ) {
		for(int i = 0; i < a.length /2 ; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	static int sumOf(int[] a) {
			int sum = 0 ; 
		for(int i = 0 ; i< a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수:");
		int num = sc.nextInt();
		
		int[] x = new int[num]; //요소수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.println("x["+ i +"] : ");
				x[i] = sc.nextInt();	
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			System.out.println("x["+ i + "] =" + x[i]);
		}
		
		System.out.println("배열 모든 요소 합계");
		
		sumOf(x);
		System.out.println(sumOf(x));
	}

}
