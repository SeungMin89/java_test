package method;

public class method_5 {

	//복수의 리턴, 배열을 이용한다.
	
	private static String[] members; //오류 이유 확인 필요


	public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
 
    public static void main(String[] args) {
        members = getMembers();
    }
}
