package java1010;

public class TestClass2 {
	// �̸��� ��� ����� �Ǿ ������ ���� ����
	// Ŭ���� �ȿ� ���� �Ǿ� ���� ������ ��� ����
	String name;   // �ʱⰪ�� null
	int num;       // �ʱⰪ�� 0
	// ���� ���� �� ������ ó�� Ŭ���� �ۿ��� ���� ���ϰ�
	// ���ƾ� �Ѵ�!! �̰� ���� �ƴϰ� �츮���� ���!!
	private String tel;
	
	// �� ó�� ������� ������ ��� �ҷ��� 
	// public �� �޼ҵ带 ���� ���
	public void setTel(String tel) {
		//tel = tel;  // ���� ������ ��� ������ �̸��� ������ �����? ��ȣ!!
		this.tel = tel;
	}
	
	// tel������ ȭ�� ���
	public void printTel() {
		System.out.println(tel);
	}
	
	public void hello() {
		// ����(�޼ҵ�)�� ���� �Ǿ� ���� ������ ���� ����
		String name;
		System.out.println("�ȳ�!! ���� TestClass2 ��");
	}

	// ��� ���� name�� ��� ���ִ� �޼ҵ�
	public void hello2() {
		System.out.println(name);
	}
	
}
