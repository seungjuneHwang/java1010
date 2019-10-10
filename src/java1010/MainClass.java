package java1010;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 메소드");
		System.out.println("내가 만든 클래스에 메소드를 불러 보자!");
		TestClass1 tc1 = new TestClass1();
		tc1.method();  // 클래스 안에 메소드 접근
		tc1.hello();
		tc1.hello1();
		tc1.hello("박기태");
		tc1.hello("김원진");
		tc1.hello("하성민");
		
		TestClass2 tc2 = new TestClass2();
		tc2.hello();
		tc2.hello2();
		tc2.name = "밖에서";
		tc2.hello2();
		// 전화 번호를 셋팅 하기 위해
		// 클래스 변수에 직접 접근 해보까?
//		tc2.tel = "010-1234-1234";  // 직접접근 NONO
		tc2.setTel("010-1234-1234");

	}

}
