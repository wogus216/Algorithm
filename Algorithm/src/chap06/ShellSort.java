package chap06;

import java.util.Scanner;

public class ShellSort {

	//셀정렬 (버전1)
	
	static void shellSort(int[] a, int n ) {
		for(int h = n /2; h > 0; h/=2) {
			for(int i = h; i < n; i++){
				int j ;
				int tmp = a[i];
				for(j = i - h; i >= 0 && a[j] > tmp; j-= h) {
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("셀정렬(버전1)");
		System.out.println("요솟수:");
		int nx = sc.nextInt();
		int[] x =new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
	
		shellSort(x, nx); //배열 x를 셀정렬
		
		System.out.println("오름 차순으로 정렬했습니다.");
		for(int i = 0; i <nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}
}
