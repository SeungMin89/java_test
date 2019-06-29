package calculatordemo_1;



	//Calculator 라는 클래스를 생성
	class Calculator {
		/**
		 * @작성자 : 정현석
		 * left, right 변수를 아래와 같이 같이 쓰는경우도 있긴하지만 
		 * 저렇게 쓰면 싫어 하는 경우가 많기도 하니 왠만하면
		 * int left = 0;
		 * int right = 0;
		 * 으로 각각 선언하고 기본값도 같이 세팅해주기 바람.
		 */
		
		int left, right ;  //변수 선언
		
		
		/**
		 * @작성자 : 정현석
		 * setOprands 함수 작성시 추가 사항
		 * 함수는 본인만 쓰는 함수도 있지만 다른사람도 같은 함수를 별도로 만들 필요없이 같은 함수를 사용하는 경우가 많음
		 * 그러므로 함수 설명내용과 인자값에 대한 설명도 작성하기 바람.
		 * 예시) 아래에 작성함
		 */
		
		/**
		 * setOprands(인자값 left, right 값을 받아 값을 변형시켜주는 함)
		 * @param left : 어떠어떤 값에서 사용하는 param
		 * @param right : 어떠어떤 값에서 사용하는 param
		 * @작성자: 정현석
		 * @작성일자: 2019.06.29
		 */
		public void setOprands(int left, int right) { 
			// 위에서 left, right 에 대해 변수형을 선언해서 여기는 없어도 되나? 싶었는데 안됨. 변수형 필요.
			this.left = left;
			this.right = right;
			// this.left를 함으로 써 하나의 인스턴스(제품)으로 사용되게 되는 것이며, setOprand 메소드 뿐만아니라 나머지에서 쓰일 수 있다.
		}
		
		public void sum() {
			System.out.println(this.left + this.right);
		}
			//더하기에 대한 메소드
		
		public void avg() {
			System.out.println((this.left + this.right)/2);
			
		}
			//평균에 대한 메소드
			//this.left + this.right -> 위에서 정의한 sum 메소드를 사용할 방법? 
	}

	public class CalculatorDemo_2 {
		// public class CalculatorDemo_2를 class 위에 위치시켜서 써봤으나 안됨. class안에 class가 있어서 인지?
		// public이 뜻하는 바는 무엇인지?
		
		public static void main(String[] args) {
		 
			Calculator c1 = new Calculator();
	    		c1.setOprands(10, 20);
	    		c1.sum();       
	    		c1.avg();       
	    		// new를 사용함으로서 Calculator를 인스턴스로 지정
	    		// Calculator c1 의 Calculator는 사용자 정의 변수형이다. 클래스명 그대로 따를것.
	    		
	    		
	    	Calculator c2 = new Calculator();
	        	c2.setOprands(20, 40);
	        	c2.sum();       
	        	c2.avg();
		
	       // new Calculator.setOprands(30.40); 오류, 형태가 잘못 된듯.
	       
		

	}

}
