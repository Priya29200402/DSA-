import java.util.Arrays;

public class CopyArrayExample {
    public static void main(String[] args) {

        String[] names = {"Priya", "Chaitra", "Hemanth", "Prajwal", "Akasha"};

        String[] selectedNames = new String[3];
        System.arraycopy(names, 0, selectedNames, 0, 3);

      
        System.out.println("Original Array:"+ Arrays.toString(names));
        System.out.println("Copied Array:"+ Arrays.toString(selectedNames));
    }
}