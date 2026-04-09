<<<<<<< HEAD
class PalindromeNumber{
    public static void main(String[] args) {
        
        int number = 121;   
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;     
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println("True - It is a Palindrome");
        } else {
            System.out.println("False - It is not a Palindrome");
        }
    }
=======
class PalindromeNumber{
    public static void main(String[] args) {
        
        int number = 121;   
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;     
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println("True - It is a Palindrome");
        } else {
            System.out.println("False - It is not a Palindrome");
        }
    }
>>>>>>> edca0795139c21219a71ec95fa705b93dda51e59
}