package else_demo;

public class conditional_demo {

	public static void main(String[] args) {
		// 논리 연산자  && = and
				
		if (10>9 && 9>8) {
			System.out.println("right");
		
		}else {
			System.out.println("wrong");
		}
			
		if (true || true) {
			System.out.println(1);
		}
		if (true || false) {
			System.out.println(2);
			
		}
		if (false ||false) {
			System.out.println(3);
		}
		

		
		
		if (!true) {
            System.out.println(1);
        }
        if (!false) {
            System.out.println(2);
        }

		
	}
	

}
