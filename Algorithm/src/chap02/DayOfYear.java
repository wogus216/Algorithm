package chap02;

import java.util.Scanner;

public class DayOfYear {
	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년
	};
	
	//서기 year년은 윤년인간?(윤년: 1/ 평년 : 0)
	static int isLeap(int year){
		return( year %4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//서기 y년은 m월의 d일의 그해 경과 일수를 구함
	static int dayOfYear(int y, int m, int d ) {
		int days = d;
		
		for(int i =1; i < m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그행 경과 일수를 구합니다.");
		
		do {
			System.out.println("년:"); int year = sc.nextInt(); // 년
			System.out.println("월:"); int month = sc.nextInt(); // 월
			System.out.println("일:"); int day = sc.nextInt(); // 일
			
		System.out.println("그해"+ dayOfYear(year, month, day)+"일재입니다.");
		
		System.out.println("한번더 할까요 (1.예/0.아니오) :");
		retry = sc.nextInt();
		}while(retry ==1);
		
	}

}
