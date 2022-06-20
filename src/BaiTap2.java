import java.util.Scanner;

public class BaiTap2 {
	public static int[] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		int y1,m1,d1,y2,m2,d2;
		System.out.println("Nhap y1 m1 d1 y2 m2 d2 thoa man dieu kien: "); // Gia su nhap dung khong xu li ngoai le
		Scanner sc = new Scanner(System.in);
		y1 = sc.nextInt();
		m1 = sc.nextInt();
		d1 = sc.nextInt();
		y2 = sc.nextInt();
		m2 = sc.nextInt();
		d2 = sc.nextInt();
		System.out.println("So ngay giua 2 moc thoi gian la: " + Result(y1, m1, d1, y2, m2, d2));
		
		// ar[m2]-d2 + for(m2+1-->m1-1) + d1 + (y1-y2)*365
		
	}
	public static int Result(int y1, int m1, int d1, int y2, int m2, int d2) {
		int p1 = 0, p2 = 0;
		p1 = daysOfMonth[m2] - d2 + 1 + (y1-y2) * 365 + d1 ; // +1 do khoang cach giua 2 so = (so cuoi - so dau)/step +1
		for(int i = m2 + 1; i < m1; i++) p2 += daysOfMonth[i];
		return p1 + p2;
	}
	

}
