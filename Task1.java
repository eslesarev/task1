public class Task1 {
	
	public static int N = 999;
	
	public static int s1() {
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}
	
	public static int s2(int d) {
		int n = N / d;
		return d * (n + 1) * n / 2;
	}
	
	public static void main(String[] args) {
		System.out.println(s1());
		System.out.println(s2(3) + s2(5) - s2(15));
	}

}
