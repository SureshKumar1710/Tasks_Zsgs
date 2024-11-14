package test2;

import java.util.*;
public class DungeonGame 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dimension of the Dungeon: ");
		int noOfRows=sc.nextInt();
		int noOfCols=sc.nextInt();
//		char[][] dungeonGrid=new char[noOfRows][noOfCols];
		
		System.out.println("Position of Adventure: ");
		int advRow=sc.nextInt();
		int advCol=sc.nextInt();
//		dungeonGrid[advRow][advCol]='A';
		
		System.out.println("Position of the Monster: ");
		int monsRow=sc.nextInt();
		int monsCol=sc.nextInt();
//		dungeonGrid[monsRow][monsCol]='M';
		
		System.out.println("Position of Gold: ");
		int goldRow=sc.nextInt();
		int goldCol=sc.nextInt();
//		dungeonGrid[goldRow][goldCol]='G';
		
		int advGoldDistance=minNoOfSteps(advRow,advCol,goldRow,goldCol);
		int advMonsDistance=minNoOfSteps(advRow,advCol,monsRow,monsCol);
		int monsGoldDistance=minNoOfSteps(monsRow,monsCol,goldRow,goldCol);
		
		boolean isPathAvailable=checkMonster(advGoldDistance, advMonsDistance,monsGoldDistance);
        if(isPathAvailable)
        {
        	ArrayList<int[]> path= getPath(advRow,advCol,goldRow,goldCol);
        	System.out.println("Minimum number of steps: "+advGoldDistance);
        	for(int[] i : path)
        	    System.out.print("("+i[0]+","+i[1]+") -> ");
        }
	}
    
    public static ArrayList<int[]> getPath(int advRow, int advCol, int goldRow, int goldCol) 
    {
		ArrayList<int[]> path=new ArrayList<>();
		while(advRow!=goldRow || advCol!=goldCol)
		{
			path.add(new int[] {advRow,advCol});
			if(advCol>goldCol)
				advCol--;
			else if(advCol<goldCol)
				advCol++;
			else if(advRow>goldRow)
				advRow--;
			else if(advRow<goldRow)
				advRow++;
		}
		path.add(new int[] {goldRow,goldCol});
		return path;
	}

	public static boolean checkMonster(int advGoldDistance, int advMonsDistance, int monsGoldDistance) 
    {
		if(advGoldDistance>monsGoldDistance && advMonsDistance<=monsGoldDistance)
			return false;
		return true;
	}

	public static int minNoOfSteps(int advRow, int advCol, int Row, int Col) 
    {
    	int temp1=Math.abs(advRow-Row);
    	int temp2=Math.abs(advCol-Col);
    	return temp1+temp2;
	}
}
