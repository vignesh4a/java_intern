class PalindromeNumber{
    public static void main(String [] args){
        System.out.println(isPalindrome(-123321));
    }

    public static boolean isPalindrome(int number){
        int temp = number;
        int calcRevNumber = 0;

        while(temp!=0){
            calcRevNumber += temp%10;
            calcRevNumber *= 10;
            temp /= 10;
        }
        
        return calcRevNumber/10 == number;
    }
}