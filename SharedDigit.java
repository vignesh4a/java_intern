class SharedDigit{

    public static void main(String [] args){

    }

    
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1>99 || num1<10) || (num2>99 || num2<10))
            return false;
            
        return (num1/10 == num2/10 || num1/10 == num2%10 || num1%10 == num2/10 || num1%10 == num2%10)?true:false;
    }
}