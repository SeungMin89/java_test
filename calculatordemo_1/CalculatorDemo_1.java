package calculatordemo_1;

public class CalculatorDemo_1 {

	//메소드 복습
	public static void sum(int left, int right) {
	// sum 이라는 메소드를 만들었고, 단순 왼쪽과 오른쪽을 더하는 메소드.
		System.out.println(left + right); // ()안에 "" 을 썼더니 left + right 그대로 출력됨. 주의 필요.
		
		
		
		
	}
	
	
	public static void avg(int left, int right) {
	// avg 라는 평균을 구하는 메소드	
		System.out.println((left + right)/2); //**숫자 2부분을 고정이 아닌 입력하는 숫자 count를 통해 쓰는걸로 바꾸는 방법????

	}
	public static void main(String[] args) {

		sum(10, 30);
		sum(20, 30);
		//메소드 sum을 사용하였고 결과 값은 40과 50이 나와야 한다.
		avg(10, 30);
		avg(20, 40);
		//결과값은 20과 30이 나와야 한다.
		
		//결과가 궁금해서 해보는 소스
		int a = 150;
		int b = 100;
		
		sum(a,b);
		avg(a,b);
		// 예상대로라면 250, 175가 나와야 한다.
		
		a = 200;
		b = 300;
		
		sum(a,b);
		avg(a,b);
		// 예상대로라면 500, 250이 나와야 한다.		
		
	}

}
