package java1010;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �޼ҵ�");
		System.out.println("���� ���� Ŭ������ �޼ҵ带 �ҷ� ����!");
		TestClass1 tc1 = new TestClass1();
		tc1.method();  // Ŭ���� �ȿ� �޼ҵ� ����
		tc1.hello();
		tc1.hello1();
		tc1.hello("�ڱ���");
		tc1.hello("�����");
		tc1.hello("�ϼ���");
		
		TestClass2 tc2 = new TestClass2();
		tc2.hello();
		tc2.hello2();
		tc2.name = "�ۿ���";
		tc2.hello2();
		// ��ȭ ��ȣ�� ���� �ϱ� ����
		// Ŭ���� ������ ���� ���� �غ���?
//		tc2.tel = "010-1234-1234";  // �������� NONO
		tc2.setTel("010-1234-1234");

	}

}
