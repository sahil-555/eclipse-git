package lti.array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		String s1[]= {"pune","delhi","chennai"};
		Arrays.sort(s1);
		for (int i=0;i<s1.length;i++) {
			System.out.println(s1[i].toUpperCase());
			System.out.println("Succesfull");
		}

	}

}
