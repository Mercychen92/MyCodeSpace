package ex001;

public class ex5_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Hello,World!";
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		String str = "Hello world";
		char mychar = str.charAt(6);
		System.out.println("字符串str中索引位置为6的字符为 "+mychar);
		System.out.println("截取字符串str索引位置从0到3的子串"+(str.substring(0,3)));
	}

}
