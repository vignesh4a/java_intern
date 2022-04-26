class SumOfDigits{
    public static void main(String [] args){
        int val = 1243;

        System.out.println(sumOfDigits(val));
    }

    public static int sumOfDigits(int number){
        int temp = 0;
        
        while(number>0){
            temp += (number%10);
            number /= 10;
        }

        return temp;
    }
}