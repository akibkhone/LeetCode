package LeetCode.Easy;

public class FinalValueOfVariableAfterPerformingOperations
{

	public static void main(String[] args)
	{
		
		String[] operations = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}
	
	public static int finalValueAfterOperations(String[] operations) {
    int x = 0;
     for(String operation : operations)
     {
         switch(operation)
         {
             case "++X":
                 x++;
                 break;
             case "X++":
                 x++;
                 break;
             case "--X":
                 x--;
                 break;
             case "X--":
                 x--;
                 break;
         }
     }
     return x;
 }

}
