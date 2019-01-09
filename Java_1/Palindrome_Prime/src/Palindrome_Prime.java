// By student Roxanne Garcia
// This is my attempt at looping through first 100k integers and displaying 
// numbers that are both prime and palindromic

public class Palindrome_Prime {

    public static void main(String[] args) {

        int startingPoint = 1;
        int startingPrime = 2;
        int printPerLine = 4;

        while(startingPrime <= 100000)
            { 
                if (checkPrime(startingPrime) && checkPalindrome(startingPrime)) {
                    System.out.print(startingPrime + " ");

                    if (startingPoint % printPerLine == 0) 

                        System.out.println();

                        startingPoint++;
                }

                startingPrime++;
        }
    }

//    method that checks if it's prime
    public static boolean checkPrime(int num) {
        if (num % 2 == 0 && num != 2) {
            return false;
        }

        int sqrt = (int)Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

//    method to check if number is palindromic
    public static boolean checkPalindrome(int num) {
        int numBackup = num;
        int backward = 0;

        while (num > 0) {
        	
        	backward = backward * 10 + num % 10;
            num = num / 10;
        }

        return (numBackup == backward);
    }
}

