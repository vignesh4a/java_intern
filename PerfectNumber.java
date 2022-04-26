class PerfectNumber{

    public static boolean isPerfectNumber(int val){
        
        if(val<1)
            return false;

        int sumOfFactors = val;

        for(int i = 1 ; i <= val/2 ; i++){
            if(val%i==0){
                sumOfFactors += i;
            }
        }

        return sumOfFactors == val;
    }

}