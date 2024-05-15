
public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo d = new MethodDemo();
		String name = getData();
		System.out.println(name);
		
		MethodDemo2 d2 = new MethodDemo2();
		d2.getUserData();
		
	}
	
	public static String getData()
	{
		System.out.println("Hello World!");
		return "Mihil Ekhankar";
	}

}
