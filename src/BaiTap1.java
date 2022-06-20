import java.util.Scanner;

public class BaiTap1 {
	enum Month {
		 JANUARY(1,31),
		 FEBRUARY(2,28),
		 MARCH(3,31),
		 APRIL(4,30),
		 MAY(5,31),
		 JUNE(6,30),
		 JULY(7,31),
		 AUGUST(8,31),
		 SEPTEMBER(9,30),
		 OCTOBER(10,31),
		 NOVEMBER(11,30),
		 DECEMBER(12,31);
		 private int days;
		 private int month;
		 private Month(int month, int days) {
			this.days = days;
			this.month = month;
		}
	}
	public static void main(String[] args) {
		//playWithEnum();   //1
		
		freePlay();       //2
		}
	
	public static void playWithEnum() {
		Month key = Month.FEBRUARY; // nhan input tu client
		System.out.print(key + " co " );
			switch (key) {
			case JANUARY:
				System.out.print(Month.JANUARY.days); 
				break;
			case FEBRUARY:
				System.out.print(Month.FEBRUARY.days); 
				break;
			case MARCH:
				System.out.print(Month.MARCH.days); 
				break;
			case APRIL:
				System.out.print(Month.APRIL.days); 
				break;
			case MAY:
				System.out.print(Month.MAY.days); 
				break;
			case JUNE:
				System.out.print(Month.JUNE.days); 
				break;
			case JULY:
				System.out.print(Month.JULY.days); 
				break;
			case AUGUST:
				System.out.print(Month.AUGUST.days); 
				break;
			case SEPTEMBER:
				System.out.print(Month.SEPTEMBER.days); 
				break;
			case OCTOBER:
				System.out.print(Month.OCTOBER.days); 
				break;
			case NOVEMBER:
				System.out.print(Month.NOVEMBER.days); 
				break;
			case DECEMBER:
				System.out.print(Month.DECEMBER.days); 
				break;
			default:
				break;
			}
			System.out.print(" ngay");
	}
	public static void freePlay() {
		int[] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Ban muon xem so ngay cua thang: ");
		int i = new Scanner(System.in).nextInt(); // + bat loi ngoai le
		System.out.println("thang " + i + " co: " + daysOfMonth[i] + " ngay");
 	}
	
}
