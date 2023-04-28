package while_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sum=0;
		
		while(true) {
			System.out.print("10부터 20사이의 수 입력 : ");
			num=scan.nextInt();
			if (num<10 || num>20) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}
		for(int i=1; i<num; i++) {
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합: " + sum);
		System.out.println("=========================");
		
		
		boolean bool = true;
		int n=1;
		while(bool) {
			// ==> bool==true
			System.out.println("bool 종속문장 실행");
			n++;
			if(n==2) {
				bool = false;
			}
			System.out.println("while 종료");
		}
		
		
	}

}
