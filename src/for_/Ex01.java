package for_;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * F11; 디버깅 시작 
		 * 오류 확인 후 실행
		 * 왼쪽 파란 바 더블 클리 => break 포인터 
		 * F5(메소드 안으로 들어감), F6; 한 줄씩 실행 
		 * F8; run. 다음 break 포인트 지점으로 이동 
		 * Ctrl + F2 ;디버깅 종료 
		 */
		System.out.println("main start");
		int sum=0;
		for (int i=1; i<10; i++) {
			sum+=i;
			System.out.println(i+" 종속 문장");
		}
		System.out.println("sum : " + sum);
		System.out.println("main end");
		
		System.out.println("main start");
		int sum1=0;
		for (int i=1; i<10000; i++) {
			sum1+=i;
			System.out.println(i+" 종속 문장");
		}
		System.out.println("sum : " + sum1);
		System.out.println("main end");
		
	}

}
