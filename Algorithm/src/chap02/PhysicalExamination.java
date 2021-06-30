package chap02;

import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX = 21;
	
	static class PhyscData{
		String name; //이름
		int height; //키
		double vision; //시력
		
		
		//생성자
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum/dat.length;
	}
	
	//시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX /10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("권재현", 170, 0.3),
				new PhyscData("권재현", 180, 0.6),
				new PhyscData("권재현", 175, 0.2),
				new PhyscData("권재현", 160, 1.3)
		};
		int[] vdist = new int[VMAX];
		
		System.out.println("★신체검사리스트★");
		System.out.println("이름 키 시력");
		System.out.println("--------------");
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i].name);
			System.out.print(", ");
			System.out.print(x[i].height);
			System.out.print(", ");
			System.out.print(x[i].vision);
			System.out.println();
		}
		System.out.println("평균키 "+ aveHeight(x));
	}

}
