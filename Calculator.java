
public class Calculator {
	
	private final String delimeter = ",|\n";
	
	
	
	public int calculate(String input) throws Exception {
		String[] numbers = input.split("delimeter");
		
		
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);
		}
		else {
			return getSum(numbers);
		}
	}
	
	private int getSum(String[] numbers) throws Exception {
		
		for(String current:numbers ) {
			if(stringToInt(current) < 0){
			  throw new Exception("Negative input");
		}
		
		}
		int sum = 0;
//		for(int current = 0; current < numbers.length ; current++ ) {
//			sum += Integer.parseInt(numbers[current]);
//		}
		for(String current:numbers ) {
			sum += Integer.parseInt(current);
		}
		return sum;
			
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
		
	}

}
