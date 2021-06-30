package chap01;

public class Max {
	
	//최대값 메소드
	static int max3(int a, int b, int c) {
		int max = a;
		
		if( b > max) {
			max = b;
		} 
		if( c > max) {
			max = c;
		}
		return max;
	}
	//최소값 메소드
	static int min3(int a, int b, int c ) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
	
public static void main(String[] args) {
		System.out.println("최대값:"+max3(2, 3, 3));
		System.out.println("최대값:"+max3(5, 7, 10));
		System.out.println("최소값:"+min3(5, -2, 0));
	}
}
