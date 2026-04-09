import java.util.Arrays;

class ReverseArray{
    public static void main(String[] args){

        int[] array = {10, 20, 30, 40, 50};

        reverse(array);

        System.out.println("Array Elements: " + Arrays.toString(array));
    }

    static void reverse(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}