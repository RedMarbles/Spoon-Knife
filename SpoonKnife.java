import java.util.Scanner;

public class SpoonKnife
{
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to spoon? >");
		String word = input.next();
		if(word.toLowerCase().equals("spoon-knife")) System.out.println("Fuck yeah! Let's fuck!");
		else System.out.println("Fuck off. I only spoon-knife.");
	}
}