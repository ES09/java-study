package oop.inter;


public class Print implements PrintSome{

	@Override
	public void printString(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
			}

	@Override
	public void printChar(char c) {
		// TODO Auto-generated method stub
		System.out.println(c);
	}

	@Override
	public void printInt(int num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
	
	// 메소드가 print에 있다는 것을 알려줘야 함
	public static void main(String[] args) {
		Print p = new Print();
		p.printString("abc");
		
		PrintSome ps = new Print(); // 가능
	}
}
