package com.icraftjava;

public class Vowel {
	public enum vowel {
		a,u,i,o,e,m
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowel[] character = vowel.values();
		for (vowel now : character) {
			switch (now) {
			case a:
				System.out.print ("a" +  " ");
				System.out.println("first letter of alphabets");

				break;
			case u:

				System.out.println("u");
				break;
			case i:

				System.out.println("i");
				break;
			case o:

				System.out.println("o");
				break;
			case e:

				System.out.println("e");
				break;
			default:

				System.out.println("constant");
				break;
			}
		}

	}

}
