package MyCoolProgram;

public class Trees {

	public static void main(String[] args) {
		int[] treeHeights = {15, 11, 9, 10, 15, 15, 9, 14};
		//plz PUT YOUR HEIGHT NUMS HERE

		
		
		//My Code
		
		//Checks for largest number
		int existingTallest;
		existingTallest = treeHeights[0];
		for(int i=0; i<treeHeights.length; i++){
			int competitor = treeHeights[i];
			if(competitor > existingTallest){
				existingTallest = competitor;
			}
		}
		System.out.println("The tallest tree height is " + existingTallest);
		
		//Number of trees with tallest height
		int countTallTrees = 0;
		for(int k=0; k<treeHeights.length; k++){
			if(treeHeights[k] == existingTallest){
				countTallTrees++;
			}
		}
		System.out.println("The number of trees with height " + existingTallest + " is " + countTallTrees);
	}

}
