class EvenSum{

    public static void main(String [] args){
        System.out.println(sumOfEven(123456789));
    }

    public static int sumOfEven(int number){
        
        if(number<0){
            return -1;
        }

        int sum = 0;
        int temp = 0;

        while(number>0){
            temp = number%10;
            if(temp%2==0)
                sum += number%10;
            number /= 10;
        }

        return sum;

    }
}