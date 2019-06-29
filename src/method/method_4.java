package method;

public class method_4 {
	
	//리턴의 다른 기능, 리턴은 메소드를 종료 시킨다.
	
	
	public static String one(int a) {
		
		if (a == 0) {
			return "0";
			
		}else if (a == 1) { 
			return "1";
			// 입력이 1이기 때문에 a == 1 일때 값을 값을 리턴하고, 여기서 메소드를 종료한다.
			
		}else if (a == 2) {
			return "2";
		}
			return "none";
		
		}
		
	public static void main(String[] args) {
		
		System.out.println(one(1));
		

	}

}
