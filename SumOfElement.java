import java.util.Arrays;
public class SumOfElement{

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = getSum(numbers);
		System.out.println("Array Elements:"+Arrays.toString(numbers));

        System.out.println("Sum of array elements: " + sum);
    }

    public static int getSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }
}