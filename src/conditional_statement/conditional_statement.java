package conditional_statement;

public class conditional_statement {

	public static void main(String[] args) {
		// if (if�� ){then ��}
		// if ���� true or false �� �� ����
		
		if (false) {
			System.out.println(1);
			System.out.println(2);
			
		}
		
		System.out.println(5);
		//if ���� false �̱� ������ ������� 5�̴�.
		
		if (false) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
		//false�� ��쿡 else ������ ����ȴ�.
		
		if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
		//true�� �������� ���� �ѹ� ����
    }

		
}
	

