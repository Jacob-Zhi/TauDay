package MyCoolProgram;

public class Trees {

	public static void main(String[] args) {
		int[] treeHeights = new int[8];
		//plz PUT YOUR HEIGHT NUMS HERE
		treeHeights[0] = 15;
		treeHeights[1] = 11;
		treeHeights[2] = 8;
		treeHeights[3] = 10;
		treeHeights[4] = 15;
		treeHeights[5] = 15;
		treeHeights[6] = 9;
		treeHeights[7] = 14;
		
		
		
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
