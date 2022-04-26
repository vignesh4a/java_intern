class Gcd_B{

    public static void main(String [] args){
        System.out.println(GreatestCommonDivisor(98, 56));

    }

    public static int GreatestCommonDivisor(int first, int second){

        if(first<10 && second<10)
            return -1;
            
        int S = (first<second)?first:second;
        int L = first+second - S;
        
        if(L%S ==0 )
            return S;
        
        for(int i=S;i>0;i--){
            if(S%i == 0 && L%i == 0){
                return i;
            }
        }

        return 1;

    }
}