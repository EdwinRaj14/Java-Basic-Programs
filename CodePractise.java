
public class CodePractise {

//Print largest number
	public static void firstLargest() {

		int[] num = { 4, 6, 5, 343, 424, 244, 53, 22, 4432, 353, 4322 };

		int flargest = num[0];

		for (int i = 1; i <= num.length - 1; i++) {
			if (num[i] >= flargest) {
				flargest = num[i];
			}
		}
		System.out.println(flargest);
	}

//print smallest number
	public static void smallestnum() {
		int[] num = { 4, 6, 5, 343, 424, 244, 3, 53, 22, 4432, 353, 4322 };

		int smallest = num[0];

		for (int i = 1; i <= num.length - 1; i++) {
			if (num[i] <= smallest) {
				smallest = num[i];
			}
		}
		System.out.println(smallest);
	}

//print second largest
	public static void secondLargestNum() {
		int[] num = { 4, 6, 5, 343, 424, 244, 3, 53, 22, 4432, 353, 4322, 4432, 4432, 4432 };

		int x;
		for (int i = 0; i <= num.length - 1; i++) {
			for (int j = i + 1; j <= num.length - 1; j++) {
				if(num[i]==num[j])
				{
					num[j]=0;
				}
				if (num[i] < num[j]) {
					x = num[i];
					num[i] = num[j];
					num[j] = x;

				}
			}
		}
		System.out.println(num[1]);
	}
	
//String reverse	
public static void reverse() {
		
			String in="edwin";
			StringBuilder out = new StringBuilder();
			char[] chars = in.toCharArray();
			for (int i = 4; i >= 0; i--) {
				out.append(chars[i]);
			}System.out.println(out);
		}


//swap without third variable

public static void swap() {
	int a = 10;
	int b = 20;
    System.out.println("a is " + a + " and b is " + b);
	a = a + b;
	b = a - b;
	a = a - b;

    System.out.println(  a +"" + b);
    }

	public static void main(String[] args) {

		CodePractise.firstLargest();
		CodePractise.smallestnum();
		CodePractise.secondLargestNum();
		CodePractise.reverse();
		CodePractise.swap();
		
	}
}
