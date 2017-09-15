package asignmt1;

public class Aa7 {

	public static void main(String[] args) {
		String s1 = "SUCCESS";
		String s2 = "";
		char[] ch = s1.toCharArray();
		int count = 1, j, a = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'S' || ch[i] == 'c') {
				count++;
			}
		}

		System.out.println("Occurrence of 'S' int the given String :: " + count);

	}
}
