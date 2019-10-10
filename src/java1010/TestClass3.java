package java1010;
/*
 * 사용자 정보 클래스
 */
public class TestClass3 {
	// 이름
	// 전화번호
	// 생년월일
	// 이메일
	// 위 데이터를 각각 멤버 변수로 선언
	
	private String name;
	private String tel;
	private String birth;
	private String email;
	
	// 값을 설정 하는 메소드들을 만들어야 하고
	// 값을 가지고 올수 있는 메소드들도 만들어야 하고
	// 언제 다 만들지???
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
		System.out.println("이름: " + name);
		System.out.println("전화: " +tel);
		System.out.println("생일: " +birth);
		System.out.println("이멜: " +email);
	}

}
