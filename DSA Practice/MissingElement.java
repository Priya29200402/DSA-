class MissingElement{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 6};

        int n = arr.length + 1; 

        int expectedSum = n*(n + 1)/2;

        int actualSum = 0;
        for (int num : arr){
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing element is:"+ missing);
    }
}