package input_output;

import java.util.Scanner;
import java.io.*;

public class IO_5 {

	//입력방법 중 파일에 담긴 데이터 값을 입력하는 방법
	
	public static void main(String[] args) {
		try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
            //try와 catch는 out.txt라는 파일이 없을때 error 값을 띄우기 위함이다.
        }

	}

}
