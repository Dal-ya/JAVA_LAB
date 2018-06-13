package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("Java");
		System.out.println("java ���ڿ� �ּ� :" +System.identityHashCode(java));//ó�� ������ �޸� �ּ�
		
		StringBuilder buffer = new StringBuilder(java); //String���� ���� StringBuilder����
		System.out.println("���� �� buufer �޸� �ּ�:" + System.identityHashCode(buffer));//buffer �޸� �ּ�
		buffer.append(" and");                // ���ڿ� �߰�
		buffer.append(" android");            // ���ڿ� �߰�
		buffer.append(" programming is fun!!!"); //���ڿ� �߰�
		System.out.println("���� �� buufer �޸� �ּ�:" + System.identityHashCode(buffer));//buffer �޸� �ּ�
		
		java = buffer.toString(); //String Ŭ������ ��ȯ
		System.out.println(java);
		System.out.println("���� ������� java ���ڿ� �ּ� :" +System.identityHashCode(java)); //���� ������ �޸� �ּ�

	}
}
