

public class BaiTap3 {
	public static final int MAX_LIMIT = 10000;
	public static void main(String[] args) {
		System.out.println(playWithDo_While());
		System.out.println(playWithForLoop());
		System.out.println(playWithWhileLoop());
		// check list prime
//		for (int i = 1; i < MAX_LIMIT; i++) {
//			if(checkPrime(i)) System.out.print(i + " ");
//		}
	}
	public static boolean checkPrime(int x) {
		if(x < 2) return false;
		for(int i = 2; i <= Math.sqrt(1.0 * x); i++) {
			if(x % i == 0) return false;
		}
		return true;
	}
	public static int playWithWhileLoop() {
		int sum = 0;
		int i = 1;
		while(i < MAX_LIMIT) {
			if(checkPrime(i)) sum += i;
			++i;
		}
		return sum;
	}
	public static int playWithDo_While() {
		int i =1;
		int sum =0;
		do {
			if(checkPrime(i)) sum += i;
			++i;
		} while (i < MAX_LIMIT);
		return sum;
	}
	public static int playWithForLoop() {
		int sum = 0;
		for (int i = 1; i < MAX_LIMIT; i++) {
			if(checkPrime(i)) sum += i;
		}
		return sum;
	}
}
