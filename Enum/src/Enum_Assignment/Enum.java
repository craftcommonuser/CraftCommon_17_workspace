package Enum_Assignment;

public class Enum {

	public enum vowel {
		a, e, i, o, u
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vowel[] character = vowel.values();

		for (vowel Now : character) {
			switch (Now) {

			case a:

				System.out.println(" 'a'  is a Vowel");

				break;

			case e:

				System.out.println(" 'e'  is a Vowel");

				break;

			case i:

				System.out.println(" 'i'  is a Vowel");

				break;

			case o:

				System.out.println(" 'o'  is a Vowel");

				break;

			case u:

				System.out.println(" 'u'  is a Vowel");

				break;
			default:
				System.out.println("It is a consonant");

			}
		}

	}

}
