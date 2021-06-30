package chap02;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		int ptr = 0;   //찾은 소수의 개수
		int[] prime = new int[500];
	
		prime[ptr++] = 2; // 2는 소수
		prime[ptr++] = 3; // 2는 소수
		
		for(int n = 5; n <= 1000; n +=2) { //대상은 홀수 만
			boolean flag = false;
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				counter +=2;
				if(n % prime[i] ==0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수 :"+ counter);
	}

}
