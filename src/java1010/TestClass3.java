package java1010;
/*
 * ����� ���� Ŭ����
 */
public class TestClass3 {
	// �̸�
	// ��ȭ��ȣ
	// �������
	// �̸���
	// �� �����͸� ���� ��� ������ ����
	
	private String name;
	private String tel;
	private String birth;
	private String email;
	
	// ���� ���� �ϴ� �޼ҵ���� ������ �ϰ�
	// ���� ������ �ü� �ִ� �޼ҵ�鵵 ������ �ϰ�
	// ���� �� ������???
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printAll() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " +tel);
		System.out.println("����: " +birth);
		System.out.println("�̸�: " +email);
	}

}
