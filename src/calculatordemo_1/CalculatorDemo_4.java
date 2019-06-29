package calculatordemo_1;


class Calculator3{
	//클래스 메소드
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	//여기선 왜 this를 쓰지 않는지 이해가 아직 불가.
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
	
	
	
}


/**
 * 합치는 기능 및 나누기 기능 호출 Main java
 * @author hyunseokjung
 */
public class CalculatorDemo_4 {

	public static void main(String[] args) {

		Calculator3.sum(10,20); //결과값 30
		Calculator3.avg(10,20); //결과값 15
		Calculator3.sum(20,30); //결과값 50
		
		
	}

}
