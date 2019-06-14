package input_output;

import java.util.Scanner;

public class IO_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
            
        //while 반복문을 통해 false 가 나기 이전까지 계속 값을 입력할 수 있다.
        }
        sc.close();
		}
		
}
