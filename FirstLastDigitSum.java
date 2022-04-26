class FirstLastDigitSum{

    public static void main(String [] args){
        System.out.println(sumOfFristLastDigit(-5));
    }

    public static int sumOfFristLastDigit(int number){
        
        if(number<0){
            return -1;
        }

        int last = number%10;

        while(number>9 || number<-9){
            number /= 10;
        }

        return number+last;

    }
}