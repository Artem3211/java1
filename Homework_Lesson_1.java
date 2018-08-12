class Homework_Lesson_1 {
	public static void main (String[] args) {
	
	
	byte a = 9;
	short c = 2131;
	int d = 213;
	long s = 1434L;
	float e = 120.0f;
	double f = 12.354425;
	boolean k = true;
	char c = 'A';
	
	
	public static int (int a,int b, int c, int d);{
return a * (b + (c / d));
	}
	
	static boolean (sumOfTwo(int a, int b)) {
		if ((a + b) > 9 && (a + b) < 21)
			return true;
		else
			return false;
	}
	
	static void (PositiveOrNegative(int a)) {
		if (a >= 0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
	
	static boolean (int a) {
		if (a < 0)
			return true;
		return false;
	}
	
	static void (String s) {
		System.out.println("Привет, " + s + "!");
	}
	
	static void (int a) {
		if ((a % 400) == 0)
			System.out.println("Високосный");
		else if ((a % 100) == 0)
			System.out.println("Не високосный");
		else if ((a % 4) == 0)
			System.out.println("Високосный");
		else
			System.out.println("Не високосный");
	}
	
}