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
	
	// hello() �޼ҵ� �̸��� �� ������ ()�ȿ� 
	// �Ű�����(�Ķ����)�� �ٸ� ��(������ �Ű�������)
	// �� ���� �����ε��̶�� �Ѵ�.
	public void hello() {
		System.out.println("hello world!!");
	}
	
	public void hello(String name) {
//		String name = "����";
//		name = "�ϼ���";
		System.out.println("�ȳ�!! " + name);
	}
	public void hello(int num) {
		System.out.println("�ȳ�!!" + num);
	}
	
	
	
	public void hello1() {
		System.out.println("�ȳ�!! ����");
	}
	public void hello2() {
		System.out.println("�ȳ�!! �ϼ���");
	}
	public void hello3() {
		System.out.println("�ȳ�!! �ڱ���");
	}

}
