package Exam0723.src;

public class StringTest1 {
	public static void main(String[] args) {
		String str = new String("hong");

		char[] carr = {'g','i','l','d','o','n','g'};
		String name = new String(carr);
		
		System.out.println(str);
		System.out.println(name);
		
		StringBuffer sb = new StringBuffer("hong gil dong");
		String fullname = new String(sb);
		
		System.out.println(fullname);
		
		char ch = str.charAt(1);
		System.out.println(ch);
		
		String fullname2 = str.concat(name);
		System.out.println(fullname2);
		
		System.out.println(fullname.contains("hong"));
		
		String filename = "hello.txt";
		System.out.println(filename.endsWith("txt"));
		System.out.println(filename.startsWith("hello"));
		System.out.println(fullname.equals(fullname2));
		
		System.out.println(str.equals("HONG"));
		System.out.println(str.equalsIgnoreCase("Hong"));
		System.out.println(str.indexOf('n'));
		System.out.println(fullname.indexOf("dong"));
		
		String str2 = "fsdsdABdfsdfsdABsdfsdfABdfsdf";
		System.out.println(str2.indexOf("AB"));
		System.out.println(str2.lastIndexOf("AB"));
		
		System.out.println(str.length());
		
		String str3 = str2.replace("AB", "ab");
		System.out.println(str3);
		System.out.println(str2);
		
		String str4 = str2.replaceAll("sd", "SD");
		System.out.println(str4);
		
		String str5 = str2.replaceFirst("AB", "ab");
		System.out.println(str5);
		
		String animals = "cat#dog#bear";
		String[] animalList = animals.split("#");
		for(int i=0; i<animalList.length; i++) {
			System.out.println(animalList[i]);
		}
		
		String[] animalList2 = animals.split("#",2);
		for(int i=0; i<animalList2.length; i++) {
			System.out.println(animalList2[i]);
		}
		
		System.out.println(fullname2);
		System.out.println(fullname2.substring(4));
		
		System.out.println(fullname2.substring(4, 7));
		
		System.out.println(name.toUpperCase());
		String str6 = "STRING";
		System.out.println(str6.toLowerCase());
		
		String str7 = "  s dfsd  ";
		System.out.println(str7);
		System.out.println(str7.length());
		
		System.out.println(str7.trim());
		System.out.println(str7.trim().length());
		
		boolean b = true;
		System.out.println(b+"");
		System.out.println(String.valueOf(b));
		
		int n = 10;
		System.out.println(n+"");
		System.out.println(String.valueOf(n));
	}

}