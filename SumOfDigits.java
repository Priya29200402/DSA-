<<<<<<< HEAD
class SumOfDigits{
    public static void main(String[] args){

        int a = 12345;
        int sum = 0;

        while (a != 0) {
            int digit = a % 10;   
            sum = sum + digit;    
            a = a / 10;           
        }

        System.out.println("Sum = " + sum);
    }
=======
class SumOfDigits{
    public static void main(String[] args){

        int a = 12345;
        int sum = 0;

        while (a != 0) {
            int digit = a % 10;   
            sum = sum + digit;    
            a = a / 10;           
        }

        System.out.println("Sum = " + sum);
    }
>>>>>>> edca0795139c21219a71ec95fa705b93dda51e59
}