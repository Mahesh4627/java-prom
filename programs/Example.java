import java.util.Scanner;
public class Example {
public static void main(String args[]) {
	String str6="java", str2=" ",str3=new String("Java");
	{ 
		System.out.println(str6==str3);
		String str="java Programming";
		System.out.println(str.toString());
		System.out.println(str.length());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		System.out.println(str.charAt(7));
		System.out.println(str.startsWith("java"));
		System.out.println(str.startsWith("Prog",5));
		System.out.println(str.endsWith("ing"));
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,10));
		System.out.println(str.replace("a"," Nitro "));
		System.out.println(str.contains("rog"));
		System.out.println(str.replaceFirst("a", " Nitro "));
		System.out.println(str.replaceAll("[ap]"," Nitro ".strip()));
		String []arr="Hi I'm Learning java".split(" ");
		for(int i=0;i<arr.length;i++)
		   System.out.println(arr[i]);
		String st=String.valueOf(487.123f);
		System.out.println(str6.equals(str3));
		System.out.println(str6.equalsIgnoreCase(str3));
		System.out.println(str6.compareTo(str3));
		System.out.println(str6.compareToIgnoreCase(str3));
	}
}
}
