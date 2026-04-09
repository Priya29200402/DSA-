public class SumEvenOdd {
    public static void main(String[] args) {
        
        int[] numbers = {10, 15, 20, 25, 30, 35};
        
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}