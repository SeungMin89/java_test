package method;

public class method_1 {
	//메소드 정의(define) 부분
	public static void numbering(int init, int limit) {
		
		int i = init;
		while(i<limit) {
			System.out.println(i);
			i++;
		
		}
	}
	//메소드 호출(call) 부분
	//numbering()을 두번 호출한다
	//3,7이 init에 반영되고, 5,8이 limit에 반영된다.
	//3,5가 반영된 결과가 한번 나오고, 7,8이 반영된 결과가 또 나온다.
	public static void main(String[] args) {
		numbering(3, 5);
		numbering(7, 8);
		
	}

}
