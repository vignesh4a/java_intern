class SameLastDigit{

    public static void main(String [] args){

        int val1 = 9;
        int val2 = 123;
        int val3 = 123;

        System.out.println(hasSameLastDigit(val1, val2, val3));
    }

    public static boolean isValid(int num){
        boolean temp = (num<1000 || num>10);

        System.out.println(temp + "" + num );
        return temp;
    }

   

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        
        if(isValid(num1) && isValid(num2) && isValid(num3)){
            return (num1%10 == num2%10 || num2%10 == num3%10 || num3%10 == num1%10);
        }
        return false;
    }
}