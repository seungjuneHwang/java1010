package java1010;
/*
 * �� Ŭ������ �ҷ��� ��� �ϴ� ���
 * Ŭ������ ���� �ϰ� Ŭ���� ������ ���� �޼ҵ� ����
 * ��) TestClass1 tc1 = new TestClass1();
 *     tc1.method();
 */

public class TestClass1 {
	// Ŭ���� �ȿ���
	// ������
	public TestClass1() {}
	// ����
	int a;
	String str;
	// �޼ҵ�
	// �� �ۼ� ����
	// ����� ��� �޼ҵ� �ȿ��� �ۼ�
	// System.out.println();   // ����!! �޼ҵ� �ȿ�!!
	
	// �޼ҵ�(�Լ�)
	public void method() {
		System.out.println("TestClass1�� �޼ҵ�");
	}
	
	public void hello() {
		System.out.println("hello world!!");
	}

}
