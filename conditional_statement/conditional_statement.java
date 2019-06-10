package conditional_statement;

public class conditional_statement {

	public static void main(String[] args) {
		// if (if절 ){then 절}
		// if 절은 true or false 값 만 들어간다
		
		if (false) {
			System.out.println(1);
			System.out.println(2);
			
		}
		
		System.out.println(5);
		//if 절이 false 이기 때문에 결과값이 5이다.
		
		if (false) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
		//false인 경우에 else 구간이 실행된다.
		
		if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
		//true인 구간에서 값만 한번 뱉어낸다
    }

		
}
	

