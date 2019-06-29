package class_method;

class C1{
    static int static_variable = 1; // 클래스 변수 static_variable 
    int instance_variable = 2; // 인스턴스 변수 instance_variable
    static void static_static(){
        System.out.println(static_variable);
        // 클래스 메소드
    }
    static void static_instance(){
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다. 
//        System.out.println(instance_variable); //에러남
    }
    void instance_static(){
        System.out.println(static_variable);
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
    }
    void instance_instance(){        
        System.out.println(instance_variable);
        // 인스턴스 메소드에 인스턴스 변수 접근 할 수 있다.
    }
}

public class Class_Method_Demo {
	public static void main(String[] args) {
		 C1 c = new C1();
		 
		 //c.static_static();
	        // 결과값 1
	        
		 //c.static_instance();
	        // 에러
	        
		 //c.instance_static();
	        // 결과값 1
		 
		 //c.instance_instance();
	        // 결과값 2
	     
		 //C1.static_static();
	        // 결과값 1
		 
		 //C1.static_instance();
	        // 에러
		 
		 //C1.instance_static();
	        // 에러
		 
		 //C1.instance_instance();
		    // 에러
	}

}
