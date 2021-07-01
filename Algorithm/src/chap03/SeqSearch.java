package chap03;

import java.util.Scanner;

public class SeqSearch {
	//요소수가 n인 배열에 a에서 key와 같은 요소를 선형검색합니다.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n) {
				return -1; //검색 실패 -1반환
			}
			if(a[i] == key) {
				return i; // 검색 성공 인덱스번호 반환
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 :");
		int num = sc.nextInt();
		int[] x = new int[num];  //요소수가 num인 배열
		
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
