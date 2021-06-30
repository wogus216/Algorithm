package chap02;

public class IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,7,4,5}; //배열의 초기자에의 생성
		int[] b = a.clone()
				; //배열의 초기자에의 생성
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int max = a[0];
		for(int i = 0 ; i <a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
	
		System.out.println("최대값"+max);
	}
	
}
