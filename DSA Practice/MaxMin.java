import java.util.Arrays;

class MaxMin{
    public static void main(String[] args){

        int[] array = {10, 20, 5, 40, 15};

        int max = getMax(array);
        int min = getMin(array);

        System.out.println("Array Elements:" + Arrays.toString(array));
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
    }

    static int getMax(int[] array) {
        int max=array[0];

        for (int num : array) {
            if (num>max) {
                max=num;
            }
        }
        return max;
    }

    static int getMin(int[] array) {
        int min=array[0];

        for (int num : array) {
            if (num<min) {
                min=num;
            }
        }
        return min;
    }
}