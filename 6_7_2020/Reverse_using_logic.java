class Reverse_using_logic{
	public static void main(String[] args) {
		int a=12;
		int b=90;
		System.out.println("before"+"a = "+a+",b = "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after "+" a= "+a+" ,b= "+b);
		
	}
}