package chap03;

import java.util.Scanner;

// 선형검색 (보초법)
public class SeqSearchSen {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;  //보초를 추가
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		return i == n ? -1 :i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 :");
		int num = sc.nextInt();
		int[] x = new int[num + 1];  //요소수가 num +1
		
		for(int i = 0; i < num; i++) {
			System.out.println("x["  + i + "] :");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값 :"); // 키 값을 입력
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx == -1) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println(ky+"은 x[" + idx + "]에 있습니다.");
		}
		
	}

}
