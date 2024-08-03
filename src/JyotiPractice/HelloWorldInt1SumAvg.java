package JyotiPractice;

public class HelloWorldInt1SumAvg {
	int getSumAndAvg(int startRange, int endRange) {
		int sum = 0, count = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 7 == 0 && num % 11 == 0) {
				sum = sum + num;
				count++;
			}
		}
		System.out.println(count);
		System.out.println("Sum of Numbers which are devisible by 7 and 11-> " + sum);

		int avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {
		HelloWorldInt1SumAvg helloWorldInt1SumAvg = new HelloWorldInt1SumAvg();
		int output = helloWorldInt1SumAvg.getSumAndAvg(50, 350);
		System.out.println("Average of Numbers which are devisible by 7 and 11-> " + output);
	}
}
