package level1;

import java.util.HashSet;

public class Poketmon {
	public int solution(int[] nums) {
		int answer = 0;  //answer을 0으로 초기화
		int Num = nums.length/2;  //Num값에 절반값 넣어줌 
		
		HashSet<Integer> set = new HashSet<>(); //증복 제거 
		for(int n : nums) { //중복 제거된 상태로 nums의 수 만큼  
			set.add(n);		//set에 n을 추가시켜 
		}
		
		if(Num >= set.size())	//만약 Num이 set에 저장된 수(중복 제거된 수)보다 같거나 크면 
			answer = set.size(); //set에 저장된 수를 answer에 담는다.  
		else 
			answer = Num;  //set.size가 클 경우 
		
		return answer; 
		
	}
	
}
