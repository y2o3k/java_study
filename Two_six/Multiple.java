package Two_six;

public class Multiple {

	   public static void main(String[] args) {
		      // 1~20사이에서 2 또는 3의 배수 출력
		      
		      for(int x = 1; x<=20; x++) {
		         if(x%2==0 || x%3==0) {
		            System.out.printf(x + " ");
		         }            
		      }
		   }
		}