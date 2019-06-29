package calculatordemo_1;

	// 클래스 변수를 활용한 계산기 
	class Calculator2{
		/**
		 * @작성자 : 정현석
		 * 변수명은 대문자로만 쓰는곳도 있지만 보통은 카멜형식함.
		 * 예시)
		 * static double pi = 3.14;
		 * 
		 * 변수명이 긴 경우 예시)
		 * static double defaultPi = 3.14;
		 *  
		 */
		static double PI = 3.14; 
		static int base = 0;
		// static을 사용하면 클래스 변수로서 사용되는 것이다.
		// 클래스 변수는 어느 인스턴스에나 같은 값으로 사용된다.
		int left, right;
		// 그냥 변수 선언
		
		
		
		
		
		public void setOprands(int left, int right) {
			this.left = left;
			this.right = right;	
		}
		
		public void sum() {
			System.out.println(this.left + this.right + base);
			// 똑같은 덧셈 메소드에 base라는 클래스 변수를 추가 시킴
		}
		
		public void avg() {
			System.out.println((this.left + this.right)/2);
			// 평균 구하는 메소드
		}
		
	}

public class CalculatorDemo_3 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		System.out.println(c1.PI); //PI 가 왜 경고창이 뜨는지???
		// 3.14가 나올것이다.
		// 인스턴스를 통해서 PI에 접근한 경우
		
		Calculator2 c2 = new Calculator2();
		System.out.println(c2.PI); //PI 가 왜 경고창이 뜨는지???
		// 3.14가 나올것이다.
		// 3.14가 나올것이다.
		// 인스턴스를 통해서 PI에 접근한 경우
		
		System.out.println(Calculator2.PI);
		// 클래스 변수는  클래스 변수 자료형을 써주고 위와같이 쓸 수 있다.
		// 클래스를 통해서 PI에 접근한 경우
		
		Calculator2 c3 = new Calculator2();
		
		c3.setOprands(10, 20);
		c3.sum(); // 30 이 나와야 한다.
		c3.avg(); // 15가 나와야 한다.
		
		Calculator2.base = 10;
		//클래스 변수인 base에 10을 대입
		
		c3.sum(); // 40이 나와야 한다.
		c3.avg(); // 15가 나온다. 대입 안했으니깐.
		

	}

}
