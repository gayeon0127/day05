package while_;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * break; switch 또는 반복문을 빠져나올 때 사용
		 * continue; 반복문의 위로 이동
		 */
		
		int i=1;
		while(true) {
			System.out.println(i++);
			if(i==5) {
				break;
			}
		}
		System.out.println("다음 문장 실행");
		System.out.println("===============");

	}

}
