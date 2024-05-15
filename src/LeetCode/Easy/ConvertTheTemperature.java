package LeetCode.Easy;

public class ConvertTheTemperature
{

	public static void main(String[] args)
	{
		for(double d : convertTemperature(36.50))
		{
			System.out.print(d + " " );
			
		}
	}
	
	
	public static double[] convertTemperature(double celsius) {
		double[] temperatures = new double[2];
		temperatures[0] = celsius + 273.15;
		temperatures[1] = celsius * 1.80 + 32.00;
    return temperatures;
  }
	

}
