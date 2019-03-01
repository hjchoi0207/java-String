package stringclass;

public class Test {

	public static void main(String[] args) {
		String str = "JAVA";
		System.out.println("str : " + str);
		str = str + "_8";
		System.out.println("str : " + str);
		
		StringBuffer sf = new StringBuffer("Python");
		System.out.println("sf : " + sf);
		sf.append("_8");
		System.out.println("sf : " + sf);
		System.out.println("sf.length() : " + sf.length());
		sf.insert(sf.length(), "!!!!!");
		System.out.println("sf : " + sf);
	}

}
