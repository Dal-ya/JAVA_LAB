package string;

public class StringTest2 {

	public static void main(String[] args) {

		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� java ���ڿ� �ּ� ��: "+ System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); //java �� android ���ڿ��� ����
		
		System.out.println(javaStr);
		System.out.println("���� �� javaandroid ���ڿ� �ּ� ��: " +System.identityHashCode(javaStr));
	}
}
