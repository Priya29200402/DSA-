import java.util.Arrays;

class SecondLargest{
    public static void main(String[] args) {

        int[] array = {10, 20, 5, 40, 15};

        int result = getSecondLargest(array);

        System.out.println("Array Elements: " + Arrays.toString(array));
        System.out.println("Second Largest: " + result);
    }

    static int getSecondLargest(int[] array) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}