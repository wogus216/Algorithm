package chap06;

import java.util.Scanner;

//버블 정렬(버전1)
public class BubbleSort {
	//a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블정렬
	static void bubbleSort(int[] a, int n ) {
		for(int i = 0; i < n; i++) {
			for(int j = n-1; j > i; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j-1, j);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬(버전1)");
		System.out.println("요솟수 :");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i =0; i < nx; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();
		}
	
		bubbleSort(x, nx); //배열 x를 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}

	}

}
