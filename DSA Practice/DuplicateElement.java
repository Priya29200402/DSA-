import java.util.HashSet;

class DuplicateElement{
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 2, 6, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate element is: " + num);
                break;
            } else {
                set.add(num);
            }
        }
    }
}