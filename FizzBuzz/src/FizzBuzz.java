
public class FizzBuzz {

	public static void main(String[] args) {
		
		int iterations = 100;
		
		fizzbuzz(iterations);
		
		
		

	}
	
	public static void fizzbuzz(int iterations)
	{
		for(int i = 1; i<= iterations; i++)
		{
			String output = ""; 	// Empty string at the start of each iteration to allow for string concatenation
			
			if(i % 3 == 0)
			{
				output+= "Fizz"; 	// If i is a multiple of 3, concatenate Fizz onto the string output
			}
			
			if(i % 5 == 0)
			{
				output+= "Buzz"; 	// If i is a multiple of 5, concatenate Buzz onto the string output
			}
			
			System.out.println(i + ": " + output);
		}
	}

}
