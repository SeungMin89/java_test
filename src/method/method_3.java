package method;

import java.io.*;

public class method_3 {

	public static String test(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
			
		}
		return output; //return을 쓰지 않았을 때 5줄에서 오류가 남. 이유 찾기
	}
	
	public static void main(String[] args) {
		String result = test(1, 5);
		System.out.println(result);
		try { 
            // 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        } 
	}

}
