package MyCoolProgram;

public class Mountainous {
	
	public static void main(String[] args) {
		//Test any 3 of these numbers or make your own
		// (yourNumber is the variable the program tests if is mountainous)
		int coolTest1 = 125789741;
		int coolTest2 = 3473;
		int coolTest3 = 21;
		int coolTest4 = 3124087;
		int yourNumber = coolTest1;
		
		
		
		//My Code
		
		//Makes sure the number is less than 3 digits
		if(yourNumber < 100) {
			System.out.println("Your number shoud be at least a 3 digit number. Try again.");
		}
		//Runs method below if is more than 3 digits
		else{
			System.out.println(checkIfMountainous(yourNumber));
		}
	}
	
	//Actual mountainous checking method
	public static boolean checkIfMountainous(int inputInt) {
		//Set the input int into a array with each digit in one "slot"
		int length = String.valueOf(inputInt).length();
		int[] inputArray = new int[length];
		String inputString = String.valueOf(inputInt);
		for(int i=0; i<inputArray.length; i++){
			Character currentCharacter = inputString.charAt(i);
			String currentCharString = currentCharacter.toString();
			int currentDigit = Integer.parseInt(currentCharString);
			inputArray[i] = currentDigit;
			
		}
		
		//Tester for printing the array above
		/*
		for(int k=0; k<inputArray.length; k++){
			System.out.println(inputArray[k]);
		}
		*/
		
		//looks for peak
		int currentMax = inputArray[0];
		for(int h=0; h<inputArray.length; h++) {
			if(inputArray[h] > currentMax) {
				currentMax = inputArray[h];
			}
		}
		
		//if the number of peaks is greater than 1 then return false
		/*
		int countMax = 0;
		for(int k=0; k<inputArray.length; k++){
			if(inputArray[k] == currentMax){
				countMax++;
			}
		}
		if(countMax != 1){
			return false;
		}
		*/
		//get peak location
		int maxLocation = 0;
		for(int q=0; q<inputArray.length; q++) {
			if(inputArray[q] == currentMax){
				maxLocation = q;
			}
		}
		
		//Check if numbers before peak are strictly increasing
		int lastNumber1;
		for(int w=0; w<maxLocation; w++){
			if(w==0){
				lastNumber1 = -1;
			}
			else{
				lastNumber1 = inputArray[w-1];
			}
			if(inputArray[w] <= lastNumber1){
				return false;
			}
		}
		
		//Check if numbers after peak are strictly decreasing
		int lastNumber2;
		for(int r=(maxLocation+1); r<inputArray.length; r++) {
			lastNumber2 = inputArray[r-1];
			if(inputArray[r] >= lastNumber2) {
				return false;
			}
		}
		
		//Return true if all the above tests fail
		return true;
	}
}
