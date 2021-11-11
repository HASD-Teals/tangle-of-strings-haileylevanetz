package tangleOfStrings;

import java.util.*;

public class TangleOfStrings {

	public static String bean;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in).useDelimiter(System.lineSeparator());
		System.out.println("Tangle of Strings");
		myPassword(sc);
		line();
		enterString(sc);
		line();
		System.out.println("What would you like to do with this line of text?");
		line();
		menu(sc);
		sc.close();

	}
	public static void myPassword (Scanner sc) {
		System.out.print("What's the password?");
		String password;
		password=sc.nextLine();
		if(password.equals("me")) {
			System.out.println("correct");
		}
		else {
			System.out.println("Incorrect passowrd. Please try again.");
			myPassword(sc);
		}

	}
	public static void enterString (Scanner sc) {
		System.out.println();
		System.out.println("Type something below");
		bean=sc.nextLine()+" ";
	}

	public static void menu(Scanner sc) {
		System.out.println("1: Print my string backward ");
		System.out.println("2: Make a list of words in my string with a given length ");
		System.out.println("3: Print out number of vowels in my string");
		System.out.println("4: Inverse the character case of my string");
		System.out.println("5: Compare to a second string for content equality");
		System.out.println("6: Replace a word in my string with a new word");
		System.out.println("7: Quit");
		System.out.println("8: Enter a different string");
		line();
		System.out.print("Please type a number listed above:");
		int num;
		num=sc.nextInt();
		if(num==1) {
			reverse();
			System.out.println();
			line();
			again(sc);
		}
		if (num==2) {
			list(sc);
			line();
			again(sc);
		}
		if (num==3) {
			vowel();
			line();
			again(sc);
		}
		if (num==4) {
			cap(sc);
			line();
			again(sc);
		}
		if(num==5) {
			match(sc);
			line();
			again(sc);
		}
		if (num==6) {
			findAndReplace(sc);
		}
		if (num==7) {
			line();
			System.out.println("\n\n\n\n\n Are you sure you would like to quit?");
			quit(sc);
		}

	}
	public static void reverse() {
		for(int a= bean.length(); a>0; a--) {
			System.out.print(bean.charAt(a-1));
		}

	}
	public static void list (Scanner sc) {
		System.out.print("What word length would you like to look for?");
		int li=sc.nextInt();
		String mountainDew ="";
		for(int a=0; a<bean.length(); a++) {
			if(!Character.toString(bean.charAt(a)).equals(" ")) {
				mountainDew += bean.charAt(a);
			}
			else{
				if(mountainDew.length()==li) {
					System.out.println(mountainDew);
				}
				mountainDew="";
			}
		}
	}
	public static void vowel () {
		int counter =0;
		for(int i=0;i<bean.length(); i++) {
			if(bean.charAt(i)=='a'||bean.charAt(i)=='e' ||bean.charAt(i)=='i'||
					bean.charAt(i)=='o'|| bean.charAt(i)=='u') {
				counter++;
			}

		}
		System.out.println("The number of vowels in your string is:"+counter);
	}
	public static void again (Scanner sc) {
		System.out.println("\n Would you like to do another one?");
		System.out.println("1- Yes  2-No");
		int yesorno;
		yesorno=sc.nextInt();
		if (yesorno==1) {
			menu(sc);
		}
		if (yesorno==2) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n ok bye.");
		}
	}
	public static void line () {
		System.out.println("_________________________________________________________________________________________________\n");
	}
	public static void cap (Scanner sc) {
		System.out.println("How would you like to print your string?");
		System.out.println("1-All UpperCase  2-All Lower Case  3-Nevermind");
		System.out.println("Select a number:");
		int answer;
		answer=sc.nextInt();
		if(answer==1){
			System.out.println(bean.toUpperCase());
		}
		if(answer==2) {
			System.out.println(bean.toLowerCase());
		}
		if(answer==3) {
			quit(sc);
		}
	}
	public static void match (Scanner sc) {
		System.out.println("Type a string to compare the other string to:");
		String equal;
		equal=sc.next() +" ";
		System.out.println("Do you want this comparison to be capps sensitive?");
		System.out.println("1-Yes  2-No");
		int jes; jes=sc.nextInt();
		if(jes==1) {
			if(equal.equals(bean)) {
				System.out.println("The content of this string is equal to the original");
			}
			else {
				System.out.println("This string is not equal to the original");
			}
		}
		if (jes==2) {
			if(equal.equalsIgnoreCase(bean)) {
				System.out.println("This string is equal to the original");
			}
			else {
				System.out.println("This string is not equal to the original");
			}
		}


	}
	public static void findAndReplace(Scanner sc) {
		int start = 0;
		String temp= "";
		System.out.print("What word would you like to find?");
		String find;
		find=sc.next();
		System.out.print("What word would you like to replace it with?");
		String replace;
		replace=sc.next();
		System.out.println(bean.replace(find,replace));
	}
	public static void quit(Scanner sc) {
		System.out.println("1-Yes  2-No");
		int yesorno; yesorno=sc.nextInt();
			if(yesorno==1) {
				System.out.println("\n\n\n\n\n\n\n\n All done :)");
				
			}
			if(yesorno==2) {
				menu(sc);
			}
		}
	}


