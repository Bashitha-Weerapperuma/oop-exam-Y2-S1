package Question02A;

import java.util.ArrayList;

public class TCalculation <T extends Number>{
	
	ArrayList<T> numList = new ArrayList<>();
	
	public void append(T value) {
		numList.add(value);
	}

	public double average() {
		
		double tot = 0 ;
		
		for(T value : numList) {
			//total = total + value.doubleValue --> total = 0 + value.doubleValue
			tot += value.doubleValue(); 
		}
		
		return tot/numList.size();
		
	}
}
