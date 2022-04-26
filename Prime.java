class Prime{

    public static void main(String [] args){
        int value = 107;

        System.out.println(isPrime(value));
    }

    public static boolean isPrime(int number){
        
        if(number<=1){

            return false;

        }
        else{

            for(int i = 2; i<=number/2;i++){
            
                if(number%i==0){
            
                    return false;
            
                }
            }

            return true;
        }
    }
}