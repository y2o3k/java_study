package Two_six;
import java.util.Scanner;
public class LeapYear {



	   static void lyear(int y) {
	      if(y%4 == 0)
	         System.out.println(y + "년은 윤년입니다");
	      else
	         System.out.println(y + "년은 윤년이 아닙니다");
	         
	   }
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("연도를 입력하세요 : ");
	      int year = sc.nextInt();
	      
	      lyear(year);
	   }
	}

