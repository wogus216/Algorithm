package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수를 입력하세요 :");
			int n = sc.nextInt();
			
			if(n == 1) {
				System.out.println("이 수는 1입니다.");
			} else if(n == 2){
				System.out.println("이 수는 2입니다.");
			} else  {
				System.out.println("이수는 3입니다.");
			}
	}

}
