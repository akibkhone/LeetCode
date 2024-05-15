package LeetCode.Easy;

public class GoalParserInterpretation
{

	public static void main(String[] args)
	{

		System.out.println(interpret("G()(al)"));
	}

	public static String interpret(String command) {
		return command.replace("()", Character.toString('o')).replace("(al)", "al");
}
	
	
}
